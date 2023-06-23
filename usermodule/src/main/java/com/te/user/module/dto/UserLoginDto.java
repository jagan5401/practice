package com.te.user.module.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserLoginDto {

	private String name;
	private Long phoneNumber;
	
	//private Long docPhoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
//	public Long getDocPhoneNumber() {
//		return docPhoneNumber;
//	}
//	public void setDocPhoneNumber(Long docPhoneNumber) {
//		this.docPhoneNumber = docPhoneNumber;
//	}
	
	
	
}
