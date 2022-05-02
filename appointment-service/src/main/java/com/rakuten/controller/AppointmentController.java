package com.rakuten.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Appointment;
import com.rakuten.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService service;
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody Appointment appointment) {
		System.out.println("Request received");
		service.saveAppointment(appointment);
	}
	
	@GetMapping("/view")
	List<Appointment> getAppoinment() {
		return service.getAllAppointments();
	}
	
	@GetMapping("/view/customer")
	List<Appointment> fetchAppointmentByName(@RequestParam String email) {
		return service.getAppointmentByCustomerEmail(email);
	}
}
