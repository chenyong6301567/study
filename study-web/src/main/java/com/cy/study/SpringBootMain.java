package com.cy.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 
 * @author Croky.Zheng
 * 2017年3月6日
 */
//@EnableAutoConfiguration //(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan
//@ImportResource
//@Configuration
@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootMain.class, args);
	}
}
