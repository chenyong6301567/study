package org.study.web;

import org.junit.After;
import org.junit.Test;

/**
 * @author cy
 * @Description 
 * @date 2017年12月3日下午2:32:08 
 */
public class JunitTest {

	@org.junit.Before
	public void before() {
		System.out.println("before");
	}

	@org.junit.BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@org.junit.AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass");
	}

	@Test
	public void test() {
		System.out.println("test");
		test2();
	}

	
	
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	
	
}
