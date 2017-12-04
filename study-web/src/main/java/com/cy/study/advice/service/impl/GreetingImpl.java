package com.cy.study.advice.service.impl;

import org.springframework.stereotype.Service;

import com.cy.study.advice.service.Greeting;

/**
 * @author cy
 *
 * 
 */
@Service
public class GreetingImpl implements Greeting {

	@Override
	public void get(String name) {
		System.out.println("你好" + name);

	}

}
