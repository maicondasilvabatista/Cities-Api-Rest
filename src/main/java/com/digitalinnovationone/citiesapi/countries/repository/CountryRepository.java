package com.digitalinnovationone.citiesapi.countries.repository;

import com.digitalinnovationone.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
