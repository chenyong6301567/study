package com.cy.study.biz.testzklock;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.cy.study.biz.test.BaseBizTest;
import com.cy.study.biz.zkLock.LockService;
import com.cy.study.biz.zkLock.LockWatcher;
import com.cy.study.biz.zkLock.Task;

@EnableAutoConfiguration
public class TestLock extends BaseBizTest {
	private static final Logger LOG = LoggerFactory.getLogger(TestLock.class);
	static int count = LockWatcher.THREAD_NUM;

	@Test
	public void TestzkLock() {
		for (int i = 0; i < LockWatcher.THREAD_NUM; i++) {
			final int threadId = i;
			new Thread() {
				@Override
				public void run() {
					try {
						new LockService().dozkLockService(new Task() {
							@Override
							public void startTask() {
								LOG.info("============" + Thread.currentThread().getName() + "我要修改一个文件=============="
										+ threadId);
								System.out.println("============" + Thread.currentThread().getName() +"================"+count--);
							}
						});
					} catch (Exception e) {
						LOG.error("【第" + threadId + "个线程】 抛出的异常：");
						e.printStackTrace();
					}
				}
			}.start();
		}
		try {
			LockWatcher.threadSemaphore.await();
			LOG.info("所有线程运行结束!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
