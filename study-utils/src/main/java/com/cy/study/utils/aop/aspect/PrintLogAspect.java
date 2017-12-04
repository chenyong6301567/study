package com.cy.study.utils.aop.aspect;

import java.util.Date;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.cy.study.utils.aop.annotation.PrintLog;
import com.cy.study.utils.aop.annotation.PrintLog.Level;

/**
 * 
 * @ClassName:PrintLogAspect
 * @Description:打印日志切面(目前支持到public方法)，默认不打印ServletRequest和ServletResponse属性
 * @author: 
 * @date 2016年9月7日 上午9:05:40
 */
@Aspect
@Component
public class PrintLogAspect {

	private final Logger logger = Logger.getLogger(PrintLogAspect.class);

	/**
	 * 记录访问时间的线程变量在函数退出时清空当前线程的数据
	 */
	private final ThreadLocal<Stack<Long>> timeThreadLocal = new ThreadLocal<Stack<Long>>();

	/**
	 * 当前线程变量中堆栈中记录的时间的最大数量，超过该数量默认为程序异常处理，初始化堆栈，并打印日志
	 */
	private final int stackMaxSize = 100;

	/**
	 * 保存打印过滤器
	 */
	private final ConcurrentMap<PrintLog, SerializeFilter[]> jsonFilterMap = new ConcurrentHashMap<PrintLog, SerializeFilter[]>();

	private final static String LOG_ANNOTATION = "@annotation(com.cy.study.utils.aop.annotation.PrintLog)";

	/**
	 * 
	 * @Title:beforeLog
	 * @author 
	 * @Description:在进入函数前打印日志
	 * @date 2016年9月7日 上午9:28:40
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	@Before(LOG_ANNOTATION)
	public void beforeLog(JoinPoint jpoint) {
		try {

			Level level = getLogLevel(jpoint);
			if (!isPrintLog(level)) {
				return;
			}

			setTime();

			Date date = new Date();

			Class<?> targetClass = jpoint.getTarget().getClass();
			String className = targetClass.getName();

			String msg = getLogUserMsg(jpoint);

			String methonName = jpoint.getSignature().getName();
			Object[] methonArgs = jpoint.getArgs();

			Thread thread = Thread.currentThread();

			SerializeFilter[] filters = getSerializeFilter(jpoint);
			printLogByLevel(level, "【进入函数打印日志：当前线程:{0} 类名:{1}  函数名:{2} 访问日期:{3} 入参:{4} 自定义信息:{5}】", thread.getName(),
					className, methonName, date.toString(), JSON.toJSONString(methonArgs, filters), msg);

		} catch (RuntimeException e) {
			logger.error("进入函数打印日志失败", e);
		}
	}

	/**
	 * 
	 * @Title:throwingLog
	 * @author 
	 * @Description:抛出异常时打印日志
	 * @date 2016年9月7日 上午10:22:50
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	@AfterThrowing(value = LOG_ANNOTATION, throwing = "exception")
	public void throwingLog(JoinPoint jPoint, RuntimeException exception) {
		Date date = new Date();

		Class<?> targetClass = jPoint.getTarget().getClass();
		String className = targetClass.getName();

		String methonName = jPoint.getSignature().getName();
		Object[] methonArgs = jPoint.getArgs();

		String msg = getLogUserMsg(jPoint);

		Thread thread = Thread.currentThread();

		SerializeFilter[] filters = getSerializeFilter(jPoint);

	}

	/**
	 * 
	 * @Title:afterReturnLog
	 * @author 
	 * @Description:返回值日志打印
	 * @date 2016年9月7日 上午9:45:45
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	@AfterReturning(value = LOG_ANNOTATION, returning = "retVal")
	public void afterReturnLog(JoinPoint jPonint, Object retVal) {

		Level level = getLogLevel(jPonint);
		if (!isPrintLog(level)) {
			return;
		}

		Date date = new Date();

		Class<?> targetClass = jPonint.getTarget().getClass();
		String className = targetClass.getName();

		String methonName = jPonint.getSignature().getName();

		String msg = getLogUserMsg(jPonint);

		Thread thread = Thread.currentThread();

		SerializeFilter[] filters = getSerializeFilter(jPonint);

		printLogByLevel(level, "【函数返回打印日志：当前线程:{0} 类名:{1}  函数名:{2} 访问日期:{3} 返回值:{4} 自定义信息:{5}】", thread.getName(),
				className, methonName, date.toString(), JSON.toJSONString(retVal, filters), msg);
	}

	/**
	 * 
	 * @Title:afterLog
	 * @author 
	 * @Description:在退出函数时打印日志（任何情况退出函数）
	 * @date 2016年9月7日 上午9:28:57
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	@After(LOG_ANNOTATION)
	public void afterLog(JoinPoint jPoint) {
		Level level = getLogLevel(jPoint);
		if (!isPrintLog(level)) {
			return;
		}

		Long time = System.currentTimeMillis() - getTime();

		Date date = new Date();

		Class<?> targetClass = jPoint.getTarget().getClass();
		String className = targetClass.getName();

		String methonName = jPoint.getSignature().getName();

		String msg = getLogUserMsg(jPoint);

		Thread thread = Thread.currentThread();

		printLogByLevel(level, "【退出函数打印日志：当前线程:{0} 类名:{1}  函数名:{2} 退出日期:{3} 函数耗时:{4} 自定义信息：{5}】", thread.getName(),
				className, methonName, date.toString(), time + "ms", msg);
	}

	/**
	 * 
	 * @Title:printLogByLevel
	 * @author 
	 * @Description:根据日志级别打印日志
	 * @date 2016年9月7日 上午9:15:20
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	private void printLogByLevel(Level level, String template, Object... parameters) {

		if (level.equals(Level.info)) {
			logger.info(parameters);
		} else if (level.equals(Level.debug)) {
			logger.debug(parameters);
		} else if (level.equals(Level.error)) {
			logger.error(parameters);
		} else if (level.equals(Level.trace)) {
			logger.trace(parameters);
		} else {
			logger.warn(parameters);
		}
	}

	/**
	 * 
	 * @Title:isPrintLog
	 * @author 
	 * @Description:判断是否需要打印日志
	 * @date 2016年9月8日 下午12:25:02
	 * @parm:
	 * @return:boolean
	 * @throws:
	 */
	private boolean isPrintLog(Level level) {

		if (level.equals(Level.info)) {
			return logger.isInfoEnabled();
		} else if (level.equals(Level.debug)) {
			return logger.isDebugEnabled();
		} else if (level.equals(Level.error)) {
			return true;
		} else if (level.equals(Level.trace)) {
			return logger.isTraceEnabled();
		} else {
			return logger.isEnabledFor(Priority.WARN);
		}

	}

	/**
	 * 
	 * @Title:getLogLevel
	 * @author 
	 * @Description:获取log级别
	 * @date 2016年9月7日 下午2:19:22
	 * @parm:
	 * @return:Level
	 * @throws:
	 */
	private Level getLogLevel(JoinPoint jPoint) {

		PrintLog printLog = ((MethodSignature) jPoint.getSignature()).getMethod().getAnnotation(PrintLog.class);
		if (printLog == null) {
			return Level.debug;
		}
		return printLog.logLevel();
	}

	/**
	 * 
	 * @Title:getLogUserMsg
	 * @author 
	 * @Description:获取用户自定义信息
	 * @date 2016年9月7日 下午5:17:44
	 * @parm:
	 * @return:String
	 * @throws:
	 */
	private String getLogUserMsg(JoinPoint jPoint) {

		PrintLog printLog = ((MethodSignature) jPoint.getSignature()).getMethod().getAnnotation(PrintLog.class);
		if (printLog == null || printLog.value() == null) {
			return "";
		}

		return printLog.value();
	}

	/**
	 * 
	 * @Title:getSerializeFilter
	 * @author 
	 * @Description:获取JSON属性过滤器
	 * @date 2016年9月7日 下午9:44:23
	 * @parm:
	 * @return:SerializeFilter
	 * @throws:
	 */
	private SerializeFilter[] getSerializeFilter(JoinPoint jPoint) {

		PrintLog printLog = ((MethodSignature) jPoint.getSignature()).getMethod().getAnnotation(PrintLog.class);
		/**
		 * 判断是否已经新建过这个过滤器，新建过就返回已经new过的对象
		 */
		if (printLog != null && jsonFilterMap.containsKey(printLog)) {
			return jsonFilterMap.get(printLog);
		}

		final Class<?>[] excludeObj = printLog == null ? null : printLog.excludeClass();

		/**
		 * getSerializeFilter根据属性打印日志
		 */
		SerializeFilter propertyPreFilter = new PropertyPreFilter() {

			@Override
			public boolean apply(JSONSerializer serializer, Object object, String name) {
				return PrintLogAspect.objectApply(object, excludeObj);
			}

		};

		SerializeFilter propertyFilter = new PropertyFilter() {
			/**
			 * 判断该属性是否需要打印
			 */
			@Override
			public boolean apply(Object object, String name, Object value) {
				return PrintLogAspect.objectApply(value, excludeObj);
			}

		};

		SerializeFilter[] filter = new SerializeFilter[] { propertyPreFilter, propertyFilter };

		if (printLog != null) {
			jsonFilterMap.put(printLog, filter);
		}
		return filter;
	}

	/**
	 * 
	 * @Title:objectApply
	 * @author 
	 * @Description:判断属性是否支持打印
	 * @date 2016年9月8日 上午8:55:05
	 * @parm:
	 * @return:boolean
	 * @throws:
	 */
	private static boolean objectApply(Object obj, final Class<?>[] excludeObj) {

		if (obj == null) {
			return true;
		}

		if (obj instanceof ServletRequest || obj instanceof ServletResponse) {
			return false;
		}

		/**
		 * excludeObj配置的不需要打印的class
		 */
		if (excludeObj != null) {
			for (Class<?> clazz : excludeObj) {
				if (clazz.isInstance(obj)) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * 
	 * @Title:setTime
	 * @author 
	 * @Description:记录当前线程下的当前函数的时间,如果当前线程中的堆栈中的数据大于100时， 
	 *                                                    默认为程序出现异常重新清楚线程变量开始计数，并打印日志
	 * @date 2016年9月8日 下午5:12:57
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	private void setTime() {
		Long time = System.currentTimeMillis();
		Stack<Long> timeStack = timeThreadLocal.get();
		if (timeStack == null) {
			timeStack = new Stack<Long>();
		}
		if (timeStack.size() >= stackMaxSize) {
			timeStack.clear();
		}
		timeStack.add(time);
		timeThreadLocal.set(timeStack);
	}

	/**
	 * 
	 * @Title:getTime
	 * @author 
	 * @Description:获取当前函数开始前的时间
	 * @date 2016年9月8日 下午5:13:51
	 * @parm:
	 * @return:void
	 * @throws:
	 */
	private Long getTime() {

		Stack<Long> timeStack = timeThreadLocal.get();
		if (timeStack == null || timeStack.size() == 0) {
			return System.currentTimeMillis();
		}

		Long time = timeStack.pop();

		if (timeStack.size() == 0) {
			timeThreadLocal.remove();
		}

		return time;
	}

}
