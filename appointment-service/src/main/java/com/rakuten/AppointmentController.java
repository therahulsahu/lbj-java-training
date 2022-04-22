package com.rakuten;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Appointment;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void createAppointment(@RequestBody Appointment appointment) {
		System.out.println("Request received");
		System.out.println(appointment);
	}
	
	@GetMapping
	void getAppoinment() {
		System.out.println("Get appointment called");
	}
}
