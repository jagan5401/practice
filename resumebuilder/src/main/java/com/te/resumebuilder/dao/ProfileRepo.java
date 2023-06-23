package com.te.resumebuilder.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.resumebuilder.entity.Profile;
@Repository
public interface ProfileRepo extends JpaRepository<Profile, Integer> {

}
