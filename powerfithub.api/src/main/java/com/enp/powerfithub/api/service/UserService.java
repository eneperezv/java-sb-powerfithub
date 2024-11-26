package com.enp.powerfithub.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enp.powerfithub.api.dto.UserDto;
import com.enp.powerfithub.api.model.User;
import com.enp.powerfithub.api.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDto createUser(UserDto userDto) {
		return buildDto(Optional.of(userRepository.save(buildEntity(userDto))));
	}

	public UserDto findById(Long id) {
		return buildDto(userRepository.findById(id));
	}
	
	public UserDto updateUser(UserDto userDto) {
		return buildDto(Optional.of(userRepository.save(buildEntity(userDto))));
	}
	
	public User buildEntity(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setPassword(userDto.getPassword());
		user.setRole(userDto.getRole());
		user.setName(userDto.getName());
		user.setDateOfBirth(userDto.getDateOfBirth());
		
		return user;
	}
	
	public UserDto buildDto(Optional<User> optional) {
		UserDto userDto = new UserDto();
		userDto.setId(optional.get().getId());
		userDto.setUsername(optional.get().getUsername());
		userDto.setPassword(optional.get().getPassword());
		userDto.setRole(optional.get().getRole());
		userDto.setName(optional.get().getName());
		userDto.setDateOfBirth(optional.get().getDateOfBirth());
		
		return userDto;
	}
	
	public UserDto buildDtoFromUser(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setPassword(user.getPassword());
		userDto.setRole(user.getRole());
		userDto.setName(user.getName());
		userDto.setDateOfBirth(user.getDateOfBirth());
		
		return userDto;
	}

}