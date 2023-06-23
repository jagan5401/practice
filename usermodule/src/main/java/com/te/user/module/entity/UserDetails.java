package com.te.user.module.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="USER_TABLE")
public class UserDetails {
	

	
	private String name;
	private Integer age;
	private String gender;
	@Column(name="Email_Id",nullable = false,unique = true)
	private String email;
	@Id
	@Column(name="Phone_Number",nullable = false,unique = true)
	private Long phoneNumber;
	//private LocalDate date;
	//private LocalTime time;
	
//	@Column(columnDefinition = "timestamp with time zone")
//	private ZonedDateTime zonedDateTime;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public LocalDate getDate() {
//		return date;
//	}
//
//	public void setDate(LocalDate date) {
//		this.date = date;
//	}
//
//	public LocalTime getTime() {
//		return time;
//	}
//
//	public void setTime(LocalTime time) {
//		this.time = time;
//	}

	
	
	public UserDetails() {
		super();
	}

	public UserDetails(String name, Integer age, String gender, String email, Long phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
	
	}
	
	
	
	
	
	
	

}
