package com.enp.powerfithub.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enp.powerfithub.api.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {

}
