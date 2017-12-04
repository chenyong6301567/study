package com.cy.study.biz.manager.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cy.study.biz.manager.ItemManager;
import com.cy.study.dal.dao.ItemDAO;
import com.cy.study.dal.model.Item;
import com.cy.study.utils.aop.annotation.PrintLog;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Component(value = "itemManager")
@CacheConfig(cacheNames = "remote-item")
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ItemManagerImpl implements ItemManager {
	private static final Logger log = LoggerFactory.getLogger(ItemManagerImpl.class);

	@Autowired
	private ItemDAO itemDAO;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public long getItemCount() {
		try {
			return itemDAO.countByExample(null);
		} catch (DataAccessException e) {
			log.error("countByExample Item failed.", e);
		}
		return 0L;
	}

	@Cacheable(key = "#id")
	@Override
	public Item getItem(long id) {
		try {
			return itemDAO.selectByPrimaryKey(id);
		} catch (DataAccessException e) {
			log.error("selectByPrimaryKey Item failed.", e);
		}
		return null;
	}

	@Override
	public Page<Item> getItems(int pageNum, int pageSize) {
		PageHelper.orderBy("id desc");
		Page<Item> page = PageHelper.startPage(pageNum, pageSize);
		try {
			itemDAO.selectByExample(null);
		} catch (DataAccessException e) {
			log.error("selectByExample Item failed.", e);
		}
		return page;
	}

	@Transactional
	@PrintLog
	public void testTransCation() {
		Item item = new Item();
		item.setShopId(111111111);
		item.setBarcode("1111111");
		item.setName("1111111111");
		item.setVipPrice(111);
		item.setStatus((short) 1);
		item.setCostPrice(11111);
		item.setPrice(11111);
		itemDAO.insert(item);
		throw new RuntimeException();
	}
}
