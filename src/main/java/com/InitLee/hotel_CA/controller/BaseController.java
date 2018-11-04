package com.InitLee.hotel_CA.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class BaseController {

	public BaseController() {
		super();
	}

	/**
	 * @ExceptionHandler 是springMVC 提供的统一异常处理方法，可以简化try catch
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Result handlerException(Exception e) {
		e.printStackTrace();
		return new Result(e);
	}
}
