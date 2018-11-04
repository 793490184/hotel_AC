package com.InitLee.hotel_CA.controller;

public class Result {

	public static final int SUCCESS = 1;
	public static final int ERROR = 0;
	private int state = SUCCESS;
	private String message = "OK";
	private Object data;

	public Result() {
	}

	public Result(Throwable e) {
		state = ERROR;
		message = e.getMessage();
	}

	public Result(String successMessage) {
		state = SUCCESS;
		message = successMessage;
	}

	public Result(int state, String message) {
		this.state = state;
		this.message = message;
	}

	public Result(int state, String message, Object data) {
		this.state = state;
		this.message = message;
		this.data = data;
	}

	public Result(Object object) {
		this(SUCCESS, "", object);
	}

	@Override
	public String toString() {
		return "Result{" +
				"state=" + state +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
