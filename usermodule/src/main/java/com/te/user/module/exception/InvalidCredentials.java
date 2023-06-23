package com.te.user.module.exception;

public class InvalidCredentials extends RuntimeException {
	
	String message;
	
	public InvalidCredentials(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
