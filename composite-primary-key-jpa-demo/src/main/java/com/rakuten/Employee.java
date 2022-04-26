package com.rakuten;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@EmbeddedId
	private EmployeeIdentity employeeIdentity;
	private String name;
	private String email;
	
	public Employee(EmployeeIdentity employeeIdentity, String name, String email, String phoneNumber) {
		super();
		this.employeeIdentity = employeeIdentity;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Employee() {
		super();
	}
	private String phoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
