package com.digitalinnovationone.citiesapi.states.repository;

import com.digitalinnovationone.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
