package com.cy.study.facade;


import com.cy.study.client.ItemService;
import com.cy.study.client.model.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.cy.study.biz.manager.ItemManager;
import com.cy.study.dal.model.Item;

@Service(version="1.0.0")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemManager itemManager;
	
	@Override
	public ItemVO getItem(long id) {
		Item item  = itemManager.getItem(id);
		ItemVO vo = new ItemVO();
		vo.setBarcode(item.getBarcode());
		vo.setId(item.getId());
		vo.setName(item.getName());
		return vo;
	}
}
