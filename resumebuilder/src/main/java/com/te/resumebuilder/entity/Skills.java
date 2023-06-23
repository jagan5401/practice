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
public class Skills {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillsId;
	private String backEndTechnologies;
	@Convert(converter = convertValue.class)
	private List<String>frontEndTechnologies;
	private String middleWareTechnologies;
	private String designpatterns;
	private String aws;
	private String sdlc;
	private String database;
	private String versionControlSystem;
	private String developmentTools;
}
