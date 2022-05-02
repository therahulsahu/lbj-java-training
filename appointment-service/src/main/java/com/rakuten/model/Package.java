package com.rakuten.model;

enum PACKAGE_TYPE{
	ONETIME, FOURSESSIONS, FIVESESSIONS
}

public class Package {
	private PACKAGE_TYPE name;
	private int amount;
	
	public PACKAGE_TYPE getName() {
		return name;
	}
	public void setName(PACKAGE_TYPE name) {
		this.name = name;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
