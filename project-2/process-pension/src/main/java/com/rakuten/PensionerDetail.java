package com.rakuten;

public class PensionerDetail {
	
	private String name;
	private String panNumber;
	private int salaryEarned;
	private int allowancesAmount;
	private String pensionType;
	private String bankType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public int getAllowancesAmount() {
		return allowancesAmount;
	}
	public void setAllowancesAmount(int allowancesAmount) {
		this.allowancesAmount = allowancesAmount;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	@Override
	public String toString() {
		return "PensionerDetail [name=" + name + ", salaryEarned=" + salaryEarned + "]";
	}
}
