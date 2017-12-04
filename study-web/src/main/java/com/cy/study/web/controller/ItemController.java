package com.cy.study.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cy.study.biz.manager.ItemManager;
import com.cy.study.web.model.Result;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemManager itemManager;
	
	@RequestMapping("count")
	long count(HttpServletRequest request,HttpServletResponse response) {
		return itemManager.getItemCount();
	}

	@RequestMapping("list")
	@ResponseBody Result list(
			@RequestParam(defaultValue="1",required = false) int n,//页码
			@RequestParam(defaultValue="20",required = false) int s,//页大小
			HttpServletRequest request,
			HttpServletResponse response) {
		return new Result(itemManager.getItems(n,s).toPageInfo());
	}

	@RequestMapping("get")
	@ResponseBody Result get(@RequestParam long id,
			HttpServletRequest request,
			HttpServletResponse response) {
		return Result.normalResponse(itemManager.getItem(id));
	}
}
