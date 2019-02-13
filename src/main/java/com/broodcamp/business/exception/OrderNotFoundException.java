package com.broodcamp.business.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Edward P. Legaspi
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class OrderNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3310173336873980506L;

	public OrderNotFoundException(Long id) {
		super("Could not find order " + id);
	}
}