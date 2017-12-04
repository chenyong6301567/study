package com.cy.study.utils.aop.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName:PrintLog
 * @Description:打印日志注解
 * @author:
 * @date 2016年9月7日 上午9:03:40
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PrintLog {
	
	/**
	 * 
	 * @Title:value
	 * @author
	 * @Description:用户自定义错误信息
	 * @date 2016年9月7日 下午5:14:16
	 * @parm:
	 * @return:String
	 * @throws:
	 */
	String value() default "";
	
	/**
	 * 
	 * @Title:logLevel
	 * @author
	 * @Description:日志级别
	 * @date 2016年9月7日 下午5:13:50
	 * @parm:
	 * @return:Level
	 * @throws:
	 */
    Level logLevel() default Level.debug;
    
    /**
     * 
     * @Title:excludeClass
     * @author
     * @Description:配置不需要打印的属性的class，默认不打印request和response属性
     * @date 2016年9月7日 下午9:50:05
     * @parm:
     * @return:Class<?>[]
     * @throws:
     */
    Class<?>[] excludeClass() default {};
    /**
     * 
     * @ClassName:Level
     * @Description:日志级别枚举
     * @author:
     * @date 2016年9月7日 上午9:04:16
     */
    public enum Level {
        trace,
        debug,
        info,
        warn,
        error;
        
        private String value;
        
        Level() {
        	//默认构造函数
        }
        
        Level(String value) {
            this.value=value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
}
