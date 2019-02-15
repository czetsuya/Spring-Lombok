package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.broodcamp.data.entity.Employee;

/**
 * @author Edward P. Legaspi
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
