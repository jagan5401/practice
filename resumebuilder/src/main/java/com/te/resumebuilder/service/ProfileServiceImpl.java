package com.te.resumebuilder.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.te.resumebuilder.dao.ProfileRepo;
import com.te.resumebuilder.dto.EmailSenderDTO;
import com.te.resumebuilder.dto.ProfileDTO;
import com.te.resumebuilder.entity.Profile;

@Service
public class ProfileServiceImpl implements ProfileService {

	
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private ProfileRepo profileRepo;

	@Override
	public Profile addProfile(ProfileDTO dto) {

		Profile profile = new Profile();
		BeanUtils.copyProperties(dto, profile);

		return profileRepo.save(profile);
	}

	@Override
	public Profile findByIdForEmail(Integer id, EmailSenderDTO dto) {
		Profile profile=new Profile();
		 profile = profileRepo.findById(id).get();

		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("jaganathan1000bc@gmail.com");
		message.setTo(dto.getEmailID());
		message.setText(profile.getFirstName());

		javaMailSender.send(message);
		System.out.println("Email_Success from"+profile.getFirstName());
return profile;
	}

}
