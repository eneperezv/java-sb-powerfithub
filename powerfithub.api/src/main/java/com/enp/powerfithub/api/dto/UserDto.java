package com.enp.powerfithub.api.dto;

import java.time.LocalDate;

public class UserDto {
	
	private Long id;
	private String username;
	private String password;
	private String role;
	private String name;
	private LocalDate dateOfBirth;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + ", name="
				+ name + ", dateOfBirth=" + dateOfBirth + "]";
	}

}