package org.study.web.advice;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

import com.cy.study.advice.GreetingAroundAdvice;
import com.cy.study.advice.service.Greeting;
import com.cy.study.advice.service.impl.GreetingImpl;

/**
 * @author cy
 *
 * 
 */
public class Client1Test {

	@Test
	public void test1() {
		ProxyFactory proxyFactory = new ProxyFactory(new GreetingImpl());
		//proxyFactory.addAdvice(new GreetingBeforeAdviceOrAfterAdvice());
		proxyFactory.addAdvice(new GreetingAroundAdvice());
		Greeting greeting=(Greeting) proxyFactory.getProxy();
		greeting.get("陈勇");
		
	}

}
