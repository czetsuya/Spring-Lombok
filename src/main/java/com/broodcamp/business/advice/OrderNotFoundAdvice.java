package com.broodcamp.business.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.broodcamp.business.exception.OrderNotFoundException;

/**
 * @author Edward P. Legaspi
 */
@RestControllerAdvice
public class OrderNotFoundAdvice {

	@ExceptionHandler(OrderNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String orderNotFoundHandler(OrderNotFoundException ex) {
		return ex.getMessage();
	}
}
