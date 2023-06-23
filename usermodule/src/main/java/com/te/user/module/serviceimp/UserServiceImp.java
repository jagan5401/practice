package com.te.user.module.serviceimp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.user.module.dto.BookAnOppointmentDto;
import com.te.user.module.dto.DoctorDetailsDto;
import com.te.user.module.dto.UserLoginDto;
import com.te.user.module.dto.UserRegisterDto;
import com.te.user.module.entity.BookAnOppointment;
import com.te.user.module.entity.DoctorDetails;
import com.te.user.module.entity.UserDetails;
import com.te.user.module.repository.AppointmentRepository;
import com.te.user.module.repository.DoctorRepository;
import com.te.user.module.repository.UserRepository;
import com.te.user.module.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	//for the reference purpose
	@Autowired
	private DoctorDetails doctorDetails;
	
//1.Registeration - User	
	@Override
	public UserDetails registerUser(UserRegisterDto userRegisterDto) {
		//Optional<UserDetails> phoneNumber = userRepository.findById(userRegisterDto.getPhoneNumber());
		//phoneNumber == null;
			UserDetails userDetails = new UserDetails();
			BeanUtils.copyProperties(userRegisterDto, userDetails);
			 UserDetails savedUser = userRepository.save(userDetails);
			return savedUser;
	}

//2.Login - User	
	@Override
	public Optional<UserDetails> loginUser(UserLoginDto userLoginDto) {
		UserDetails details = new UserDetails();
		BeanUtils.copyProperties(userLoginDto, details);
		Optional<UserDetails> validNumber = userRepository.findById(details.getPhoneNumber());
		if(validNumber.isPresent() && validNumber.get().getName().equalsIgnoreCase(userLoginDto.getName())) {
		
			return validNumber;
		}
		return null;
	}

	
//3.Registeration - Doctor(Optional)
	@Override
	public DoctorDetails registerationDoctor(DoctorDetailsDto doctorDetailsDto) {
		//Optional<DoctorDetails> id = 
				//Optional<DoctorDetails> findById = doctorRepository.findById(doctorDetailsDto.getDocPhoneNumber());
		//if(findById.equals(null)) {
			DoctorDetails doctorDetails = new DoctorDetails();
			BeanUtils.copyProperties(doctorDetailsDto, doctorDetails);
			DoctorDetails saved = doctorRepository.save(doctorDetails);
			return saved;
		//}
		
	}

//4.Get All the doctors list	
	@Override
	public List<DoctorDetails> getAllDoctorsList() {
		List<DoctorDetails> findAll = doctorRepository.findAll();
		return findAll;
		
	}

//5.Oppointment-Booking	
	@Override
	public BookAnOppointment requestForAnOppointment(BookAnOppointmentDto bookAnOppointmentDto) {
		Optional<BookAnOppointment> docNumber = appointmentRepository.findById(bookAnOppointmentDto.getDocPhoneNumber());
		
		if(docNumber == null ) {
		BookAnOppointment oppointment = new BookAnOppointment();
		//oppointment.setfindById(bookAnOppointmentDto.getPhoneNumber());
		//oppointment.setDate(LocalDate.now());
		//oppointment.setTime(LocalTime.now());
		//oppointment.setDate(LocalDate.of(2023, 01, 30));
		//oppointment.setTime(LocalTime.of(8, 30, 0));
		oppointment.setDate(bookAnOppointmentDto.getDate());
		oppointment.setTime(bookAnOppointmentDto.getTime());
		oppointment.setPhoneNumber(bookAnOppointmentDto.getPhoneNumber());
		oppointment.setDocPhoneNumber(bookAnOppointmentDto.getDocPhoneNumber());
		oppointment.setDoctorDetails(doctorDetails.getClass().cast(doctorDetails.getDocName()));
		oppointment.setDoctorDetails(doctorDetails.getClass().cast(doctorDetails.getSpecialistIn()));
		
		return oppointment;
		}
		return null;
	}

	@Override
	public List<DoctorDetailsDto> findByDocName(String docName) {
		List<DoctorDetailsDto> listOfDoctors = doctorRepository.findAll()
				.stream().map(name -> new DoctorDetailsDto(name.getDocName()))
				.collect(Collectors.toList());
		return listOfDoctors;
	}

	
//	@Override
//	public List<String> findByDocName(String docName) {
//		List<DoctorDetails> doctors = doctorRepository.findByDocName(docName);
//		//List<String> doctors = 
//		List<String> doctorsName = new ArrayList<>();
//		for (String nameList : doctors) {
//			doctorsName.add(doctors);
//			
//			//doctorsName.add(doctors.getClass().getCanonicalName());
//			//doctorsName.add(doctors.getClass().getName());
//		}
//		return doctorsName;	
//	}
	
	//.findById(name.equalsIgnoreCase(doctorRepository.getClass().getName()));
	
	

//	@Override
//	public List<String> searchByDoctorsName(String name, DoctorDetailsDto doctorDetailsDto) {
//		doctorRepository.findAll()
//		.stream().sorted().toArray()
//		.getClass().getName().equalsIgnoreCase(doctorDetailsDto.getDocName());
//		return null;
//	}

//	@Override
//	public DoctorDetails searchByDoctorsName(DoctorDetailsDto doctorDetailsDto) {
//		doctorRepository.findAll()
//			.stream().sorted().toArray().getClass()
//			.getName().equalsIgnoreCase(null);// (or) equalsIgnoreCase(doctorDetailsDto.getDocName());
//		return null;
//	}


}
