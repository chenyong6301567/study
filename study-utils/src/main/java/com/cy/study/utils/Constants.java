package com.cy.study.utils;

import java.util.UUID;

public class Constants {

	public final static String WELCOME = "Hello Croky!";
	
	/* sql table parameter */
	public final static String TABLE_CERTIFY_NAME = "gen_certify";//店铺认证表名字
	public final static String CLUMN_ALL = "*"; //查询所有列
	public final static String ORDERBY_POSTTIME = "posttime";//常用排序字段 posttime
	public final static String ORDERBY_ASC = " asc"; //升序
	public final static String ORDERBY_DESC = " desc";//降序
	public final static String UUID_REGEX = "^[a-zA-Z0-9_\\-]{32}$";
	public final static String TABLE_ARTICLE_NAME = "gen_article";
	public final static String TABLE_MASSSMS_NAME = "gen_massSms";
	

	public static String getUUID() {
		String s = UUID.randomUUID().toString().toLowerCase();
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18) + s.substring(19, 23) + s.substring(24);
	}

}
