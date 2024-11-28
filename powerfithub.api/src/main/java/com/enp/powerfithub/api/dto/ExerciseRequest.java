package com.enp.powerfithub.api.dto;

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
