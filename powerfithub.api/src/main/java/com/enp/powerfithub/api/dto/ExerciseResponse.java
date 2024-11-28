package com.enp.powerfithub.api.dto;

public class ExerciseResponse {
	
	private Long id;
    private String name;
    private String muscleGroup;
    private int durationInMinutes;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "ExerciseResponse [id=" + id + ", name=" + name + ", muscleGroup=" + muscleGroup + ", durationInMinutes="
				+ durationInMinutes + "]";
	}

}
