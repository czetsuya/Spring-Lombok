package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.broodcamp.data.entity.Product;

/**
 * @author Edward P. Legaspi
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
