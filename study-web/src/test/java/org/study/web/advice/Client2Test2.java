package org.study.web.advice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.study.SpringBootMain;
import com.cy.study.advice.service.Greeting;
import com.cy.study.advice.service.impl.GreetingImpl;

/**
 * @author cy
 *
 * 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Client2Test2 {

	@Autowired
	private ProxyFactoryBean proxyFactoryBean;

	@Test
	public void test() {
		Greeting greeting = (Greeting) proxyFactoryBean;
		greeting.get("陈勇");

	}

}
