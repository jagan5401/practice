package com.te.user.module.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BookAnOppointment {
	
	@Id
	private Long phoneNumber;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate date;
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime time;
	private Long docPhoneNumber;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private DoctorDetails doctorDetails;
	
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
	public DoctorDetails getDoctorDetails() {
		return doctorDetails;
	}
	public void setDoctorDetails(DoctorDetails doctorDetails) {
		this.doctorDetails = doctorDetails;
	}
	public Long getDocPhoneNumber() {
		return docPhoneNumber;
	}
	public void setDocPhoneNumber(Long docPhoneNumber) {
		this.docPhoneNumber = docPhoneNumber;
	}
	
	public BookAnOppointment(Long phoneNumber, LocalDate date, LocalTime time, Long docPhoneNumber,
			DoctorDetails doctorDetails) {
		super();
		this.phoneNumber = phoneNumber;
		this.date = date;
		this.time = time;
		this.docPhoneNumber = docPhoneNumber;
		this.doctorDetails = doctorDetails;
	}
	public BookAnOppointment() {
		super();
	}
	
	
}
