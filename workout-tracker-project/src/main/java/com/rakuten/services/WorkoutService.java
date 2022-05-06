package com.rakuten.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.model.Workout;
import com.rakuten.repository.WorkoutRepository;

@Service
public class WorkoutService {
	
	@Autowired
	WorkoutRepository repository;
	
	public void saveWorkout(Workout workout) {
		repository.save(workout);
	}
	
}
