package com.te.user.module.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Doctor_Details")
@Component

public class DoctorDetails {
	
	@Column(name="Doctor_Name",nullable = false)
	private String docName;
	@Column(name="Specialist_In",nullable = false)
	private String specialistIn;
	@Id
	@Column(name="Phone_Numer",nullable = false,unique = true)
	private Long docPhoneNumber;
	
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getSpecialistIn() {
		return specialistIn;
	}
	public void setSpecialistIn(String specialistIn) {
		this.specialistIn = specialistIn;
	}
	public Long getDocPhoneNumber() {
		return docPhoneNumber;
	}
	public void setDocPhoneNumber(Long docPhoneNumber) {
		this.docPhoneNumber = docPhoneNumber;
	}
	public DoctorDetails(String docName, String specialistIn, Long docPhoneNumber) {
		super();
		this.docName = docName;
		this.specialistIn = specialistIn;
		this.docPhoneNumber = docPhoneNumber;
	}
	public DoctorDetails() {
		super();
	}
	
	public DoctorDetails(String docName) {
		this.docName=docName;
	}
	
	
	
}
