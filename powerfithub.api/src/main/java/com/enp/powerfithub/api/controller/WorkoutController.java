package com.enp.powerfithub.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enp.powerfithub.api.dto.WorkoutRequest;
import com.enp.powerfithub.api.dto.WorkoutResponse;
import com.enp.powerfithub.api.service.WorkoutService;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
	
	private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @PostMapping
    public ResponseEntity<WorkoutResponse> createWorkout(@RequestBody WorkoutRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(workoutService.createWorkout(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutResponse> getWorkout(@PathVariable Long id) {
        return ResponseEntity.ok(workoutService.getWorkoutById(id));
    }

    @GetMapping
    public ResponseEntity<List<WorkoutResponse>> getAllWorkouts() {
        return ResponseEntity.ok(workoutService.getAllWorkouts());
    }

}
