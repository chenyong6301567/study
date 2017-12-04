package com.cy.study.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cy.study.utils.Constants;
import com.cy.study.utils.aop.annotation.PrintLog;
import com.cy.study.utils.aop.annotation.PrintLog.Level;
import com.cy.study.web.vo.ResetVO;

@RestController
public class IndexController {

	@RequestMapping("/")
	@PrintLog(logLevel = Level.info)
	@ResponseBody
	String home(HttpServletRequest request, HttpServletResponse response, String name) {
		throw new RuntimeException("dfdfdfsd0-o2590-0-952");
		//return Constants.WELCOME + name;
	}

	@RequestMapping("/result")
	@ResponseBody
	ResetVO result(HttpServletRequest request, HttpServletResponse response) {
		ResetVO vo = new ResetVO();
		vo.setId(88888888L);
		vo.setName("Croky.Zheng");
		return vo;
	}

}
