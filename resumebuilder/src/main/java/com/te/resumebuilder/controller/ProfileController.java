package com.te.resumebuilder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.resumebuilder.dto.EmailSenderDTO;
import com.te.resumebuilder.dto.ProfileDTO;
import com.te.resumebuilder.entity.Profile;
import com.te.resumebuilder.service.ProfileService;
@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@PostMapping("/addProfile")
	public ResponseEntity<?> addProfile(@RequestBody ProfileDTO dto) {
		Profile addProfile = profileService.addProfile(dto);
		
		if (addProfile!=null) {
			return new ResponseEntity<String>("Success",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("failed",HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping("/email/{id}")
	public ResponseEntity<?> emailSender(@PathVariable Integer id,@RequestBody EmailSenderDTO dto) {
	Profile output= profileService.findByIdForEmail(id, dto);
	if (output!=null) {
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}else {
		return new ResponseEntity<String>("failed",HttpStatus.BAD_REQUEST);
	}
		
	}
	
	
}
