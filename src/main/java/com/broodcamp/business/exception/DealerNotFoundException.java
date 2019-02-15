package com.broodcamp.business.exception;

/**
 * @author Edward P. Legaspi
 */
public class DealerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2081510408619694253L;

	public DealerNotFoundException(Long id) {
		super("Could not find dealer " + id);
	}

}
