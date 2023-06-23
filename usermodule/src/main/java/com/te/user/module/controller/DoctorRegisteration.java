package com.te.user.module.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.user.module.dto.DoctorDetailsDto;
import com.te.user.module.entity.DoctorDetails;
import com.te.user.module.exception.InvalidDocCredentials;
import com.te.user.module.response.DoctorResponse;
import com.te.user.module.service.UserService;

@RestController
@RequestMapping("/api/doctor")
public class DoctorRegisteration {
	
	@Autowired
	public DoctorResponse doctorResponse;
	@Autowired
	public UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<DoctorResponse> registerationDoctor(@RequestBody DoctorDetailsDto doctorDetailsDto) {
		DoctorDetails doctorDetails = userService.registerationDoctor(doctorDetailsDto);
		if(doctorDetails != null) {
			doctorResponse.setMessage("Registeration sucessful Dr."+doctorDetails.getDocName());
			doctorResponse.setErrorMessage(false);
			doctorResponse.setData(doctorDetails);
			doctorResponse.setStatus(200);
			return new ResponseEntity<DoctorResponse> (doctorResponse,HttpStatus.CREATED);
		} else {
			throw new InvalidDocCredentials("Pls enter the proper data");
		}
		
	}
 
}
