package com.te.user.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.user.module.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
