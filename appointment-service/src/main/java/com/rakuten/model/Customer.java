package com.rakuten.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

enum PACKAGE_TYPE{
	ONETIME, FOURSESSIONS, FIVESESSIONS
}

@Entity
public class Customer {
	
	@Id
	private Integer id;
	private String name;
	private int age;
	private String mobileNumber;
	private String emailId;
	private String address;
	
	@Enumerated(EnumType.STRING)
	private PACKAGE_TYPE packageName;
	private int amount;
	
	@OneToMany(targetEntity = Appointment.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Appointment> appointments = new ArrayList<>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public PACKAGE_TYPE getPackageName() {
		return packageName;
	}
	public void setPackageName(PACKAGE_TYPE packageName) {
		this.packageName = packageName;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", address="  + "]";
	}

}
