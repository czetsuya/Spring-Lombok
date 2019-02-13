package com.broodcamp.web.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broodcamp.data.entity.Employee;

/**
 * @author Edward P. Legaspi
 */
@RestController
public class HelloController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello")
	public String hello() {
		return messageSource.getMessage("hello", null, LocaleContextHolder.getLocale());
	}
	
	@GetMapping(path = "/hello/employee")
	public Employee helloEmployee() {
		return new Employee("edward", "lastname", "admin");
	}

}
