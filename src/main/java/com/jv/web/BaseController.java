package com.jv.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseController {
	public Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 全局异常拦截，封装报错信息
	 * 
	 * @param exception
	 * @return
	 */
//	@ExceptionHandler(Exception.class)
//	public Object runtimeExceptionHandler(Exception exception) {
//		// 打印 报错堆栈轨迹
//		exception.printStackTrace();
//
////		ResultMessage<String> result = new ResultMessage<>();
////		result.setMessage("出错了");
////		result.setData(exception.getMessage());
////		result.setSuccess(false);
//		return "hello";
//	}
}
