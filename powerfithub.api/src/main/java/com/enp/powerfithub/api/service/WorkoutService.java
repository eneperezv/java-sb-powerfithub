package com.enp.powerfithub.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enp.powerfithub.api.dto.WorkoutRequest;
import com.enp.powerfithub.api.dto.WorkoutResponse;
import com.enp.powerfithub.api.model.Workout;
import com.enp.powerfithub.api.repository.WorkoutRepository;

@Service
public class WorkoutService {
	
	private final WorkoutRepository workoutRepository;
    private final ExerciseService exerciseService;

    public WorkoutService(WorkoutRepository workoutRepository, ExerciseService exerciseService) {
        this.workoutRepository = workoutRepository;
        this.exerciseService = exerciseService;
    }

    public WorkoutResponse createWorkout(WorkoutRequest request) {
        Workout workout = new Workout();
        workout.setName(request.getName());
        workout.setDate(request.getDate());
        workout.setStatus("Planned");

        workout = workoutRepository.save(workout);

        return mapToResponse(workout);
    }

    public WorkoutResponse getWorkoutById(Long id) {
        Workout workout = workoutRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Workout not found"));
        return mapToResponse(workout);
    }

    public List<WorkoutResponse> getAllWorkouts() {
        List<Workout> workouts = workoutRepository.findAll();
        return workouts.stream().map(this::mapToResponse).toList();
    }

    private WorkoutResponse mapToResponse(Workout workout) {
        WorkoutResponse response = new WorkoutResponse();
        response.setId(workout.getId());
        response.setName(workout.getName());
        response.setDate(workout.getDate());
        response.setStatus(workout.getStatus());
        response.setExercises(
            workout.getExercises().stream()
                .map(exerciseService::mapToResponse)
                .toList()
        );
        return response;
    }

}
