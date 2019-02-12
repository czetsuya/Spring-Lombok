package com.broodcamp.business.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.hateoas.ResourceSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Edward P. Legaspi
 */
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductRatingDto extends ResourceSupport {

	@NotNull
	private Long customerId;

	@Min(0)
	@Max(5)
	private Integer rating;

	public ProductRatingDto(Long customerId, Integer rating) {
		this.customerId = customerId;
		this.rating = rating;
	}

}
