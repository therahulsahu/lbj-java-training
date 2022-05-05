package com.rakuten.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

enum TRAINERPREFERENCE {
	FEMALE, MALE, NONE
}

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "Customer_id")
	private Customer customer;
	
	@Enumerated(EnumType.STRING)
	private TRAINERPREFERENCE trainerPreference;
	private boolean needPysiohotherapist;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
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
