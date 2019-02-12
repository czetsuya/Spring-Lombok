package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broodcamp.data.entity.Customer;

/**
 * @author Edward P. Legaspi
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
