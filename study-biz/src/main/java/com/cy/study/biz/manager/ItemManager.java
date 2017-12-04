package com.cy.study.biz.manager;

import com.github.pagehelper.Page;
import com.cy.study.dal.model.Item;

public interface ItemManager {

	long getItemCount();

	Page<Item> getItems(int pageNum, int pageSize);

	Item getItem(long id);

	void testTransCation();
}
