package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broodcamp.data.entity.Order;

/**
 * @author Edward P. Legaspi
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
