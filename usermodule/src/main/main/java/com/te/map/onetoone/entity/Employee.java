package com.te.map.onetoone.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


@Entity
@Transactional
@Table(name="employee_details")
@Component
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Integer empId;
	private String empName;
	private Integer empAge;


	public Integer  getEmpId() {
		return empId;
	}


	public void setEmpId(Integer  empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getEmpAge() {
		return empAge;
	}


	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}


	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge 
				+ "]";
	}



	//one to one uni-directional mapping concept --> no need to mention on the second entity class
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk__id")
	private Address address;
	
	
	
	
	
	
	

}
