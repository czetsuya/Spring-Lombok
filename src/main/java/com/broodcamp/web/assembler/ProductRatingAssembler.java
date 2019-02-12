package com.broodcamp.web.assembler;

import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.broodcamp.business.domain.ProductRatingDto;
import com.broodcamp.data.entity.ProductRating;
import com.broodcamp.data.repository.CustomerRepository;
import com.broodcamp.web.application.ProductRatingController;

/**
 * @author Edward P. Legaspi
 */
@Component
public class ProductRatingAssembler extends ResourceAssemblerSupport<ProductRating, ProductRatingDto> {

	// Helper to fetch Spring Data Rest Repository links.
	private RepositoryEntityLinks entityLinks;

	public ProductRatingAssembler(RepositoryEntityLinks entityLinks) {
		super(ProductRatingController.class, ProductRatingDto.class);
		this.entityLinks = entityLinks;
	}

	/**
	 * Generate self, rating and customer links.
	 */
	@Override
	public ProductRatingDto toResource(ProductRating entity) {
		ProductRatingDto dto = new ProductRatingDto(entity.getCustomer().getId(), entity.getRating());

		ControllerLinkBuilder productRatingLink = ControllerLinkBuilder.linkTo(ControllerLinkBuilder.methodOn(ProductRatingController.class).getProductRating(entity.getId()));
		dto.add(productRatingLink.withSelfRel());

		Link customerLink = entityLinks.linkToSingleResource(CustomerRepository.class, entity.getCustomer().getId());
		dto.add(customerLink.withRel("customer"));

		return dto;
	}

}
