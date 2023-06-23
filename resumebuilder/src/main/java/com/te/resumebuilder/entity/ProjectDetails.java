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
public class ProjectDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projectDetailsId;
	@Convert(converter = convertValue.class)
	private List<String> frontEndTechnologies;
	@Convert(converter = convertValue.class)
	private List<String> backEndTechnologies;
	@Convert(converter = convertValue.class)
	private List<String> designPatterns;
	@Convert(converter = convertValue.class)
	private List<String> database;
	@Convert(converter = convertValue.class)
	private List<String> developmentTools;
	private String duration;
	private Integer teamSize;
	@Convert(converter = convertValue.class)
	private List<String> projectDescription;
	@Convert(converter = convertValue.class)
	private List<String> roles_Responsebilities;

}
