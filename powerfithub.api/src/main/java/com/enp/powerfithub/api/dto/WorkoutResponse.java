package com.enp.powerfithub.api.dto;

/*
 * @(#)WorkoutResponse.java 1.0 27/11/2024
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

import java.time.LocalDateTime;
import java.util.List;

public class WorkoutResponse {
	
	private Long id;
    private String name;
    private LocalDateTime date;
    private String status;
    private List<ExerciseResponse> exercises;
    
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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ExerciseResponse> getExercises() {
		return exercises;
	}

	public void setExercises(List<ExerciseResponse> exercises) {
		this.exercises = exercises;
	}

	@Override
	public String toString() {
		return "WorkoutResponse [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}
