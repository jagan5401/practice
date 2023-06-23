package com.te.user.module.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BookAnOppointmentDto {
	
	private Long phoneNumber;
	private LocalDate date;
	private LocalTime time;
	private Long docPhoneNumber;
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public Long getDocPhoneNumber() {
		return docPhoneNumber;
	}
	public void setDocPhoneNumber(Long docPhoneNumber) {
		this.docPhoneNumber = docPhoneNumber;
	}
	
	
	

}
