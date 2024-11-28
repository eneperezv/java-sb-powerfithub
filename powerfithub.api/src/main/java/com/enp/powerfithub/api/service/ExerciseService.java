package com.enp.powerfithub.api.service;

/*
 * @(#)ExerciseService.java 1.0 27/11/2024
 * 
 * El código implementado en este formulario esta protegido
 * bajo las leyes internacionales del Derecho de Autor, sin embargo
 * se entrega bajo las condiciones de la General Public License (GNU GPLv3)
 * descrita en https://www.gnu.org/licenses/gpl-3.0.html
 */

/**
 * @author eliezer.navarro
 * @version 1.0
 * @since 1.0
 */

import org.springframework.stereotype.Service;

import com.enp.powerfithub.api.dto.ExerciseRequest;
import com.enp.powerfithub.api.dto.ExerciseResponse;
import com.enp.powerfithub.api.exception.ResourceNotFoundException;
import com.enp.powerfithub.api.model.Exercise;
import com.enp.powerfithub.api.model.Workout;
import com.enp.powerfithub.api.repository.ExerciseRepository;
import com.enp.powerfithub.api.repository.WorkoutRepository;

@Service
public class ExerciseService {
	
	private final ExerciseRepository exerciseRepository;
    private final WorkoutRepository workoutRepository;

    public ExerciseService(ExerciseRepository exerciseRepository, WorkoutRepository workoutRepository) {
        this.exerciseRepository = exerciseRepository;
        this.workoutRepository = workoutRepository;
    }

    public ExerciseResponse createExercise(ExerciseRequest request) {
        Workout workout = workoutRepository.findById(request.getWorkoutId())
            .orElseThrow(() -> new ResourceNotFoundException("Workout not found"));

        Exercise exercise = new Exercise();
        exercise.setName(request.getName());
        exercise.setMuscleGroup(request.getMuscleGroup());
        exercise.setDurationInMinutes(request.getDurationInMinutes());
        exercise.setWorkout(workout);

        exercise = exerciseRepository.save(exercise);

        return mapToResponse(exercise);
    }

    public void deleteExercise(Long id) {
        if (!exerciseRepository.existsById(id)) {
            throw new ResourceNotFoundException("Exercise not found");
        }
        exerciseRepository.deleteById(id);
    }

    public ExerciseResponse mapToResponse(Exercise exercise) {
        ExerciseResponse response = new ExerciseResponse();
        response.setId(exercise.getId());
        response.setName(exercise.getName());
        response.setMuscleGroup(exercise.getMuscleGroup());
        response.setDurationInMinutes(exercise.getDurationInMinutes());
        return response;
    }

}
