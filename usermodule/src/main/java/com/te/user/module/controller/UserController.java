package com.te.user.module.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.te.user.module.dto.BookAnOppointmentDto;
import com.te.user.module.dto.DoctorDetailsDto;
import com.te.user.module.dto.UserLoginDto;
import com.te.user.module.dto.UserRegisterDto;
import com.te.user.module.entity.BookAnOppointment;
import com.te.user.module.entity.DoctorDetails;
import com.te.user.module.entity.UserDetails;
import com.te.user.module.exception.InvalidCredentials;
import com.te.user.module.exception.InvalidUserNameOrPhoneNumber;
import com.te.user.module.response.UserResponse;
import com.te.user.module.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserResponse userResponse;
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<UserResponse> registerUser(@RequestBody UserRegisterDto userRegisterDto) {
		UserDetails registered = userService.registerUser(userRegisterDto);
		if(registered!=null) {
			userResponse.setMessage("Sucessfully registered Mr/Ms "+registered.getName());
			userResponse.setErrorMessage(false);
			userResponse.setData(registered);
			userResponse.setStatus(200);
			return new ResponseEntity<UserResponse> (userResponse,HttpStatus.ACCEPTED);	
		} else {
		 throw new InvalidCredentials("Pls enter the proper credentials");
		}
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserLoginDto userLoginDto) {
		Optional<UserDetails> loginUser = userService.loginUser(userLoginDto);
		if(loginUser.isPresent()) {
			userResponse.setMessage("Login Sucessful "+loginUser.get().getName());
			userResponse.setErrorMessage(false);
			userResponse.setData(loginUser);
			userResponse.setStatus(200);
			return new ResponseEntity<UserResponse> (userResponse,HttpStatus.ACCEPTED);	
		} else {
			throw new InvalidUserNameOrPhoneNumber("Pls check the username/password");
		}
	}	
	
		@GetMapping("/getAll")
		public ResponseEntity<UserResponse> getAllDoctorslist() {
			List<DoctorDetails> doctorsList = userService.getAllDoctorsList();
			if(doctorsList!=null) {
				userResponse.setMessage("pls check out the list");
				userResponse.setErrorMessage(false);
				userResponse.setData(doctorsList);
				userResponse.setStatus(200);
				
			return new ResponseEntity<UserResponse> (userResponse,HttpStatus.ACCEPTED);	
				
		} else 
			return null;
		}
		
	
		@PostMapping("/book/oppointment")
		public ResponseEntity<UserResponse> requestForAnOppointment(@RequestBody BookAnOppointmentDto bookAnOppointmentDto) {
			BookAnOppointment oppointment = userService.requestForAnOppointment(bookAnOppointmentDto);
			if(oppointment!=null) {
				userResponse.setMessage("Oppointment has been booked");
				userResponse.setErrorMessage(false);
				userResponse.setData(oppointment);
				userResponse.setStatus(200);
				
			return new ResponseEntity<UserResponse>	(userResponse,HttpStatus.ACCEPTED);
			} else {
			throw new InvalidCredentials("Pls enter the proper credentials");
			}
		}
		
//		@PostMapping("/search/byname")
//		public ResponseEntity<UserResponse> searchByDoctorsName(@RequestParam String name, DoctorDetailsDto doctorDetailsDto) {
//			userService.searchByDoctorsName(doctorDetailsDto);
//			
//			return null;
//		}
		
		
//		@GetMapping("/search/byname")
//		public ResponseEntity<UserResponse> findByDocName(@RequestParam("docName") String docName) {
//			List<String> doctorsName = userService.findByDocName(docName);
//			
//			//List<String> doctorsName = userService.findByDocName(docName);
//			if(doctorsName.contains(doctorsName)) {
//				
//				userResponse.setMessage("Doctors list for your view");
//				userResponse.setErrorMessage(false);
//				userResponse.setData(doctorsName);
//				userResponse.setStatus(200);
//				
//				return new ResponseEntity<UserResponse> (userResponse,HttpStatus.ACCEPTED);
//			} else {
//				return new ResponseEntity<UserResponse> (userResponse,HttpStatus.BAD_REQUEST);
//				}
//			
//		}
	
		@GetMapping("/search/byname")
		public ResponseEntity<UserResponse> findByDocName(@RequestParam("docName") String docName) {
			List<DoctorDetailsDto> nameList = userService.findByDocName(docName);
			if(nameList != null) {
				userResponse.setMessage("Doctors list for your view");
				userResponse.setErrorMessage(false);
				userResponse.setData(nameList);
				userResponse.setStatus(200);
				
				return new ResponseEntity<UserResponse> (userResponse,HttpStatus.ACCEPTED);
			} else { 
				return new ResponseEntity<UserResponse> (userResponse,HttpStatus.BAD_REQUEST);
			}
		}
}		
		
			
		
		
		

	
	
	
	
	


