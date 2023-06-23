package com.te.user.module.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserResponse {
	
	private String message;
	private Boolean errorMessage;
	private Object data;
	private Integer status;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(Boolean errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
