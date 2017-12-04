package com.cy.study.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author cy
 *
 * 
 */
public class GreetingBeforeAdviceOrAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println(args.toString());
		System.out.println("afterReturning");
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println(args.toString());
		System.out.println("before");
	}

}
