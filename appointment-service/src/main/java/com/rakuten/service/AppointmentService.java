package com.rakuten.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rakuten.model.Appointment;

@Service
public class AppointmentService {
	List<Appointment> repository = new ArrayList<>();
	
	public void saveAppointment(Appointment appointment) {
		repository.add(appointment);
		System.out.println("appointment saved");
	}
	
	public List<Appointment> getAllAppointments() {
		return repository;
	}
	
	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		return repository.stream().filter(appointment -> appointment.getCustomer().getEmailId().equals(email)).collect(Collectors.toList());
	}
}
