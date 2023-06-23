package com.te.user.module.response;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class DoctorResponse {

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

	public DoctorResponse(String message, Boolean errorMessage, Object data, Integer status) {
		super();
		this.message = message;
		this.errorMessage = errorMessage;
		this.data = data;
		this.status = status;
	}

	public DoctorResponse() {
		super();
	}
	
	
	
	
}
