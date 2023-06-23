package com.te.user.module.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDetailsDto {
	
	private String docName;
	private String specialistIn;
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
	
	public DoctorDetailsDto(String docName) {
		this.docName=docName;
	}
	
	

}
