package com.te.user.module.exception;

import javax.print.DocFlavor.STRING;

public class InvalidDocCredentials extends RuntimeException {
	
	String message;
	
	public InvalidDocCredentials(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
