package com.te.resumebuilder.service;

import com.te.resumebuilder.dto.EmailSenderDTO;
import com.te.resumebuilder.dto.ProfileDTO;
import com.te.resumebuilder.entity.Profile;

public interface ProfileService {

	public Profile addProfile(ProfileDTO dto);



	Profile findByIdForEmail(Integer id, EmailSenderDTO dto);


}
