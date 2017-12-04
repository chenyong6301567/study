package com.cy.study.biz.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cy.study.biz.config.cache.CacheConfiguration;
//import com.cy.study.biz.SpringBootBizMain;
import com.cy.study.biz.manager.ItemManager;
import com.cy.study.dal.config.DataSourceConfiguration;
import com.cy.study.dal.config.MyBatisConfigurer;
import com.cy.study.dal.config.MyBatisMapperScannerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@ContextConfiguration(classes={DataSourceConfiguration.class,
		MyBatisConfigurer.class,
		MyBatisMapperScannerConfig.class,
		CacheConfiguration.class})
//这个注解的class必须在上层package中
//@SpringBootTest(classes=SpringBootBizMain.class)
//这个注解一定要放到最下面
@ComponentScan(basePackages={"com.cy.study.biz"})
public class BaseBizTest {
	
	@Autowired
	//@Qualifier("itemManager")
	protected ItemManager itemManager;
	
	@Test
	public void testItemCount() {
		System.out.println(itemManager.getItemCount());
	}

	public ItemManager getItemManager() {
		return itemManager;
	}

	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}
}
