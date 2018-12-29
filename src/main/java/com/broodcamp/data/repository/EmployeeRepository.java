package com.broodcamp.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.broodcamp.data.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
