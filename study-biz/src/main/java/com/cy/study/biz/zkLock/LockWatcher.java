package com.cy.study.biz.zkLock;

import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LockWatcher implements Watcher {
	private static final Logger LOG = LoggerFactory.getLogger(LockWatcher.class);
	public static final int THREAD_NUM = 20;
	public static CountDownLatch threadSemaphore = new CountDownLatch(THREAD_NUM);
	private DistributedLock distributedLock;
	private Task task;

	public LockWatcher(DistributedLock distributedLock, Task task) {
		this.distributedLock = distributedLock;
		this.task = task;
	}

	@Override
	public void process(WatchedEvent event) {
		if (event.getType() == Event.EventType.NodeDeleted && event.getPath().equals(distributedLock.getWaitPath())) {
			LOG.info(Thread.currentThread().getName() + "收到情报，排我前面的家伙已挂，我是不是可以出山了？");
			try {
				if (distributedLock.checkMinPath()) {
					goStartTask();
					distributedLock.unlock();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void goStartTask() {
		LOG.info(Thread.currentThread().getName() + "获取锁成功，准备干活啦====!");
		task.startTask();
		threadSemaphore.countDown();
	}

}
