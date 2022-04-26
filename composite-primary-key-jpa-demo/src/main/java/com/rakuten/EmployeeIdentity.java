package com.rakuten;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeIdentity implements Serializable {
	
	private String employeeId;
	private String companyId;
	
	public EmployeeIdentity() {
		super();
	}
	
	public EmployeeIdentity(String employeeId, String companyId) {
		super();
		this.employeeId = employeeId;
		this.companyId = companyId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
}
