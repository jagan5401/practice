package com.te.resumebuilder.entity;

import java.util.List;

import com.te.resumebuilder.convertion.convertValue;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	private String highestEducation;
	private String specialisation;
	@Convert(converter = convertValue.class)
	private List<String> university;
	private Integer passedOutYear;
	private Double percentage;
}
