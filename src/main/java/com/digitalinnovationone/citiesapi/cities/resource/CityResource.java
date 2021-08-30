package com.digitalinnovationone.citiesapi.cities.resource;

import com.digitalinnovationone.citiesapi.cities.entity.City;
import com.digitalinnovationone.citiesapi.cities.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cities")
public class CityResource {

    private final CityRepository cityRepository;

    @GetMapping
    public Page<City> cities(final Pageable page){
        return cityRepository.findAll(page);
    }
}
