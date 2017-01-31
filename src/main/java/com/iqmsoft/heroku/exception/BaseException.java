package com.iqmsoft.heroku.exception;

public abstract class BaseException extends Exception {

	private static final long serialVersionUID = -1753744151843189555L;
	
	private String error;
	
	public BaseException(String error) {
		super();
		this.error = error;
	}

	public String getError() {
		return error;
	}

}