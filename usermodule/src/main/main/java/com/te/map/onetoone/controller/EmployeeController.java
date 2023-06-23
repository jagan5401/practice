package com.te.map.onetoone.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.map.onetoone.entity.Employee;
import com.te.map.onetoone.repository.Employeerepository;
import com.te.map.onetoone.response.MyResponse;



@RestController
public class EmployeeController {
	
	@Autowired
	private Employeerepository employeerepository;
	
	@Autowired
	private MyResponse myResponse;
	
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		employeerepository.save(employee);
		return ResponseEntity.ok("data saved");
		
	}
	

}
