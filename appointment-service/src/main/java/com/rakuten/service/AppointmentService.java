package com.rakuten.service;

import java.util.ArrayList;
import java.util.List;

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
}
