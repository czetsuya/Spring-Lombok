package com.broodcamp.business.exception;

/**
 * @author Edward P. Legaspi
 */
public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3310173336873980506L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}