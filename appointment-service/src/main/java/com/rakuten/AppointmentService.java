package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rakuten.model.Appointment;

@Service
public class AppointmentService {
	List<Appointment> repository = new ArrayList<>();
	
	void saveAppointment(Appointment appointment) {
		repository.add(appointment);
		System.out.println("appointment saved");
	}
	
	List<Appointment> getAllAppointments() {
		return repository;
	}
}
