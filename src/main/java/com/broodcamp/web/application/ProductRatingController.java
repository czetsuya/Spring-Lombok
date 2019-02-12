package com.broodcamp.web.application;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

/**
 * @author Edward P. Legaspi
 */
@Api("API to just pull ratings")
@RestController
@RequestMapping(path = "/products/{productId}/ratings")
public class ProductRatingController {

	public BigDecimal getProductRating(Long productRatingId) {
		return null;
	}

}
