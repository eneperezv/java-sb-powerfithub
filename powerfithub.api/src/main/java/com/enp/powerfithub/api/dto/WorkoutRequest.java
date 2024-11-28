package com.enp.powerfithub.api.dto;

import java.time.LocalDateTime;

public class WorkoutRequest {
	
	private String name;
    private LocalDateTime date;
    
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

	@Override
	public String toString() {
		return "WorkoutRequest [name=" + name + ", date=" + date + "]";
	}

}
