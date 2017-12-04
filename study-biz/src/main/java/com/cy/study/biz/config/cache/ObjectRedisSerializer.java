package com.cy.study.biz.config.cache;

import java.nio.charset.Charset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import com.cy.study.utils.Json;

/**
 * 
 * @author Croky.Zheng
 * 2017年6月19日
 */
public class ObjectRedisSerializer implements RedisSerializer<Object> {
	private final Logger log = LoggerFactory.getLogger(ObjectRedisSerializer.class);

	private Charset charset = Charset.forName("utf-8");

	private final String SPLIT_STRING = "==::::==";
	
	private final String DEFAULT_CONTENT = "__CROKY-REDIS-KEY-NULL__";
	
	public ObjectRedisSerializer() {
		this(Charset.forName("UTF8"));
	}

	public ObjectRedisSerializer(Charset charset) {
		//Assert.notNull(charset);
		if (null == charset) {
			charset = Charset.defaultCharset();
		}
		this.charset = charset;
	}

	@Override
	public byte[] serialize(Object t) throws SerializationException {
		if (null == t) {
			t = DEFAULT_CONTENT;
		}
		return object2String(t).getBytes(charset);
	}

	@Override
	public Object deserialize(byte[] bytes) throws SerializationException {
		String content = null;
		//理论上不会有null值
		if (null != bytes) {
			content = new String(bytes,charset);
			return parse(content);
		}
		return null;
	}

	
	private  String object2String(Object object) {
		StringBuffer buf = null;
		buf = new StringBuffer();
		buf.append(object.getClass().getName()).append(SPLIT_STRING).append(Json.object2Json(object));
		return buf.toString();
	}
	
	private Object parse(String content) {
		String[] arr = content.split(SPLIT_STRING);
		if (arr.length == 2) {
			Class<?> clazz;
			try {
				clazz = Class.forName(arr[0]);
				return Json.json2Object(arr[1], clazz);
			} catch (ClassNotFoundException e) {
				log.error("class实例失败:" + arr[0]);
			}
		}
		return null;
	}

}
