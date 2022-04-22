package com.rakuten.model;

public class Customer {
	private String name;
	private int age;
	private String mobileNumber;
	private String emailId;
	private Address address;
	private Package selectedPackage;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
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
	public Package getSelectedPackage() {
		return selectedPackage;
	}
	public void setSelectedPackage(Package selectedPackage) {
		this.selectedPackage = selectedPackage;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}

}
