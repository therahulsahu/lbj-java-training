package com.rakuten.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.Appointment;
import com.rakuten.repository.AppointmentRepository;
import com.rakuten.repository.CustomerRepository;

@Service
public class AppointmentService {
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	public void saveAppointment(Appointment appointment) {
		if(!customerRepository.existsById(appointment.getCustomer().getId())) {
			customerRepository.save(appointment.getCustomer());
		}
		appointmentRepository.save(appointment);
		System.out.println("appointment saved");
	}
	
	public List<Appointment> getAllAppointments() {
		return appointmentRepository.findAll();
	}
	
	public List<Appointment> getAppointmentByCustomerEmail(String email) {
		return appointmentRepository.findByCustomerEmailId(email);
		
	}
	
	public void updateAppointment(Appointment appointment) {
		if(!appointmentRepository.existsById(appointment.getId())) {
			throw new IllegalArgumentException();
		}
		appointmentRepository.save(appointment);
		System.out.println("updated");
	}
	
	public void deleteAppointment(int id) {
		appointmentRepository.deleteById(id);
	}
}
