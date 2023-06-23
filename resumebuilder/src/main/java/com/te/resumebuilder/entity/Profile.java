package com.te.resumebuilder.entity;

import java.util.List;

import com.te.resumebuilder.convertion.convertValue;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profileId;
	private String firstName;
	private String lastName;
	private String totalExperience;
	private String releventExperience;
	
	@Convert(converter = convertValue.class)
	private List<String> technology;

	private String summary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Skills skills;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Education education;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<ProjectDetails> projectDetails;

}
