package com.te.user.module.exception;

public class InvalidUserNameOrPhoneNumber extends RuntimeException {
	
	String message;
	
	public InvalidUserNameOrPhoneNumber(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
 
}
