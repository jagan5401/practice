package com.te.user.module.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.user.module.dto.DoctorDetailsDto;
import com.te.user.module.entity.DoctorDetails;

@Repository
public interface DoctorRepository extends JpaRepository<DoctorDetails, Long> {

	List<DoctorDetailsDto> findByDocName(String docName);
	
	//ContainingIgnoreCase(String docName);
	
	//List<String> findBydoContainingIgnoreCase(String docName);

}
