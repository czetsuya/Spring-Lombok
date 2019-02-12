package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broodcamp.data.entity.Product;

/**
 * @author Edward P. Legaspi
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
