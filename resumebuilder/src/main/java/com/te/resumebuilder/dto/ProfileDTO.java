package com.te.resumebuilder.dto;

import java.util.List;

import com.te.resumebuilder.entity.Education;
import com.te.resumebuilder.entity.ProjectDetails;
import com.te.resumebuilder.entity.Skills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {

	
	private Integer profileId;
	private String firstName;
	private String lastName;
	private String totalExperience;
	private String releventExperience;
	private List<String>technology;
	
	private String summary;
	private Skills skills;
	private Education education;
	private List<ProjectDetails> projectDetails;
	
	
}
