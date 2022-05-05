package com.rakuten.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rakuten.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

	List<Appointment> findByCustomerEmailId(String emailId);
}
