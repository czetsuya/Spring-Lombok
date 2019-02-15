package com.broodcamp.web.application;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broodcamp.business.domain.EmployeeFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * @author Edward P. Legaspi
 */
@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public MappingJacksonValue retrieveSomeBean() {
		EmployeeFilter EmployeeFilter = new EmployeeFilter("edward", "legaspi", "admin");

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("firstName", "lastName");

		FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(EmployeeFilter);

		mapping.setFilters(filters);

		return mapping;
	}

	@GetMapping("/filtering-list")
	public MappingJacksonValue retrieveListOfSomeBeans() {
		List<EmployeeFilter> EmployeeFilters = Arrays.asList(new EmployeeFilter("edward", "legaspi", "admin"), new EmployeeFilter("edward", "legaspi", "admin"));

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("role", "lastName");

		FilterProvider filters = new SimpleFilterProvider().addFilter("EmployeeFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(EmployeeFilters);

		mapping.setFilters(filters);

		return mapping;
	}
}
