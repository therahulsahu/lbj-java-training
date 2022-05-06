package com.rakuten.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.model.Workout;
import com.rakuten.services.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {
	
	@Autowired
	WorkoutService service;
	
	@PostMapping
	void postWorkout(@RequestBody Workout workout) {
		System.out.println(workout.getTitle());
		service.saveWorkout(workout);
	}
	
}
