package com.cy.study.utils;


import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.croky.lang.Path;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author Croky.Zheng
 * 2017年3月22日
 */
public class Json {
	private Json(){}
	private static ObjectMapper mapper = new ObjectMapper();
	static {
		//mapper.getSerializationConfig().setSerializationInclusion(inclusion);
		//设置输入时忽略JSON字符串中存在而Java对象实际没有的属性 
		//mapper.getDeserializationConfig().set(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//mapper.getSerializationConfig().setDateFormat(df);
		//mapper.getDeserializationConfig().setDateFormat(df);
	}

	public static <T> T json2Object(String json,Class<T> clazz) {
		try {
			return JSON.parseObject(json, clazz);
		} catch (Exception e) {
			return null;
		}
	}
	public static <T> List<T> json2Objects(String json,Class<T> clazz) {
		try {
			List<T> result = JSONArray.parseArray(json, clazz);//JSON.parseArray(json, clazz);
			return result;
		} catch (Exception e) {
			return null;
		}
	}

	public static <T> T json2Object(String json,T value) {
		try {
			return JSON.parseObject(json,new TypeReference<T>(){});
		} catch (Exception e) {
			return null;
		}
	}

	
	public static JSONObject json2Node(String json) {
		try {
			return JSON.parseObject(json);
		} catch (Exception e) {
			return null;
		}
	}

	public static String object2Json(Object object) {
		try {
			return JSON.toJSONString(object);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String getValue(String json,String xpath) {
		if ((null == json) || (null == xpath)) {
			return null; 
		}
		String[] names = xpath.split("[.]");
		try {
			JsonNode node = mapper.readTree(json);
			for (int i=0; i<names.length; i++) {
				if (null == node) return null;
				Path path = Path.getPath(names[i]);
				if (null != path) {
					node = node.get(path.name);
					if ((null != node) && node.isArray()) {
						node = node.get(path.index);
					}
				} else {
					node = node.get(names[i]);
					if ((null != node) && node.isArray()) {
						node = node.get(0);
					}
				}
			}
			if (null != node) {
				return node.asText();
			}
		} catch (Exception e) {
		}
		return null;
	}
}
