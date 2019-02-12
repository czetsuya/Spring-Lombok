package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.broodcamp.data.entity.ProductRating;

/**
 * @author Edward P. Legaspi
 */
@RepositoryRestResource(exported = false)
public interface ProductRatingRepository extends JpaRepository<ProductRating, Long> {

}
