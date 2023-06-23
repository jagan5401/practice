package com.te.map.onetoone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;



@Entity
@Transactional
@Table(name = "address")
@Component
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "add_id")
	private Long addressId;
	private String city;
	private String addressType;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Address(Long addressId, String city, String addressType, Employee employee) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
		this.employee = employee;
	}

	//one to one uni-directional mapping concept --> no need to mention on this entity class(second
														//entity class)
	@OneToOne(mappedBy = "address")
	private Employee employee;

}	
