package com.enp.powerfithub.api.dto;

/*
 * @(#)ExerciseRequest.java 1.0 27/11/2024
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

public class ExerciseRequest {
	
	private String name;
    private String muscleGroup;
    private int durationInMinutes;
    private Long workoutId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(String muscleGroup) {
		this.muscleGroup = muscleGroup;
	}

	public int getDurationInMinutes() {
		return durationInMinutes;
	}

	public void setDurationInMinutes(int durationInMinutes) {
		this.durationInMinutes = durationInMinutes;
	}

	public Long getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
	}

	@Override
	public String toString() {
		return "ExerciseRequest [name=" + name + ", muscleGroup=" + muscleGroup + ", durationInMinutes="
				+ durationInMinutes + ", workoutId=" + workoutId + "]";
	}

}
