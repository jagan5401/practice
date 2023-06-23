package com.te.user.module.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class UserRegisterDto {
	
	private String sNo;
	private String name;
	private Integer age;
	private String gender;
	private String email;
	private Long phoneNumber;
	
	//private LocalDate date;
	//private LocalTime time;
	
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public UserRegisterDto(String sNo, String name, Integer age, String gender, String email, Long phoneNumber) {
		super();
		this.sNo = sNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public UserRegisterDto() {
		super();
	}	
//	public LocalDate getDate() {
//		return date;
//	}
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//	public LocalTime getTime() {
//		return time;
//	}
//	public void setTime(LocalTime time) {
//		this.time = time;
//	}
	
	

}
