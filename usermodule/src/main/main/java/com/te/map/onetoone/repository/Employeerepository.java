package com.te.map.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.map.onetoone.entity.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer >{

}
