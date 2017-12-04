package org.study.web.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.study.SpringBootMain;
import com.cy.study.biz.manager.ItemManager;

/**
 * @author cy
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisTest {

	@Autowired
	private ItemManager itemManager;

	@Test
	public void testRedis() {
		itemManager.testTransCation();

	}
}
