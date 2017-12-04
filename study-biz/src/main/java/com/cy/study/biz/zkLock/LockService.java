package com.cy.study.biz.zkLock;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

public class LockService {
	// 确保所有线程运行结束；
	private static final String CONNECTION_STRING = "127.0.0.1:2181";
	private static final int THREAD_NUM = 10;
	public static CountDownLatch threadSemaphore = new CountDownLatch(THREAD_NUM);
	private static final String GROUP_PATH = "/disLocks";
	private static final int SESSION_TIMEOUT = 10000;
	AbstractZooKeeper abstractZooKeeper = new AbstractZooKeeper();

	public void dozkLockService(Task task) {
		try {
			ZooKeeper zooKeeper = abstractZooKeeper.connect(CONNECTION_STRING, SESSION_TIMEOUT);
			DistributedLock distributedLock = new DistributedLock(zooKeeper);
			LockWatcher lockWatcher = new LockWatcher(distributedLock, task);
			distributedLock.setWatcher(lockWatcher);
			distributedLock.createPath(GROUP_PATH, "该节点由线程" + Thread.currentThread().getName() + "创建");
			boolean rs = distributedLock.getLock();
			if (rs) {
				lockWatcher.goStartTask();
				distributedLock.unlock();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (KeeperException e) {
			e.printStackTrace();
		}
	}
}
