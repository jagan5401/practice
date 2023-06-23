package com.te.user.module.service;

import java.util.List;
import java.util.Optional;

import com.te.user.module.dto.BookAnOppointmentDto;
import com.te.user.module.dto.DoctorDetailsDto;
import com.te.user.module.dto.UserLoginDto;
import com.te.user.module.dto.UserRegisterDto;
import com.te.user.module.entity.BookAnOppointment;
import com.te.user.module.entity.DoctorDetails;
import com.te.user.module.entity.UserDetails;


public interface UserService {

	UserDetails registerUser(UserRegisterDto userRegisterDto);

	Optional<UserDetails> loginUser(UserLoginDto userLoginDto);

	DoctorDetails registerationDoctor(DoctorDetailsDto doctorDetailsDto);

	java.util.List<DoctorDetails> getAllDoctorsList();

	BookAnOppointment requestForAnOppointment(BookAnOppointmentDto bookAnOppointmentDto);

	List<DoctorDetailsDto> findByDocName(String docName);

	//List<String> searchByDoctorsName(String name);

	//List<String> findByDocName(String docName);

	//List<String>  searchByDoctorsName(String name, DoctorDetailsDto doctorDetailsDto);

	

}
