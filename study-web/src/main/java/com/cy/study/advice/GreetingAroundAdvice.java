package com.cy.study.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author cy
 *
 * 
 */
@Component 
public class GreetingAroundAdvice implements MethodInterceptor {

	/**
	* @Title invoke
	* @author cy
	* @Description 
	* @date 2017年8月10日上午11:07:19
	* @param 
	* @param 
	* @param 
	* @throws:
	*/
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
		Object result = invocation.proceed();
		after();
		return result;

	}

	private void before() {
		System.out.println("before=================");
	}

	private void after() {
		System.out.println("after===================");
	}
}
