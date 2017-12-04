package com.cy.study.config.advice;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cy.study.advice.service.Greeting;
import com.cy.study.advice.service.impl.GreetingImpl;

/**
 * @author cy
 *
 * 
 */
@Configuration
public class config {
	@Bean
	public ProxyFactoryBean getGreetingProxy() {
		ProxyFactoryBean config = new ProxyFactoryBean();
		config.setInterfaces(Greeting.class);
		config.setTarget(new GreetingImpl());
		config.setInterceptorNames("greetingAroundAdvice");
		return config;
	}
}
