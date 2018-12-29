package com.broodcamp.business.exception;

/**
 * @author Edward P. Legaspi
 */
public class OrderNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3310173336873980506L;

	public OrderNotFoundException(Long id) {
		super("Could not find order " + id);
	}
}