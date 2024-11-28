package com.enp.powerfithub.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enp.powerfithub.api.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise,Long> {

}
