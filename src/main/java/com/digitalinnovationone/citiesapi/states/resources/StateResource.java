package com.digitalinnovationone.citiesapi.states.resources;

import com.digitalinnovationone.citiesapi.states.entity.State;
import com.digitalinnovationone.citiesapi.states.repository.StateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/states")
@RequiredArgsConstructor
public class StateResource {

    private final StateRepository stateRepository;

    @GetMapping
    public List<State> states(){
        return stateRepository.findAll();
    }
}
