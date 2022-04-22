package com.rakuten.model;

enum TRAINERPREFERENCE {
	FEMALE, MALE, NONE
}

public class Appointment {
	private Customer customer;
	private TRAINERPREFERENCE trainerPreference;
	private boolean needPysiohotherapist;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public TRAINERPREFERENCE getTrainerPreference() {
		return trainerPreference;
	}
	public void setTrainerPreference(TRAINERPREFERENCE trainerPreference) {
		this.trainerPreference = trainerPreference;
	}
	public boolean isNeedPysiohotherapist() {
		return needPysiohotherapist;
	}
	public void setNeedPysiohotherapist(boolean needPysiohotherapist) {
		this.needPysiohotherapist = needPysiohotherapist;
	}
	@Override
	public String toString() {
		return "Appointment [customer=" + customer + ", trainerPreference=" + trainerPreference
				+ ", needPysiohotherapist=" + needPysiohotherapist + "]";
	}
}
