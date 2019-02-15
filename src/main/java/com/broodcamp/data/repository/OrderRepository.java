package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.broodcamp.data.entity.Order;

/**
 * @author Edward P. Legaspi
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
