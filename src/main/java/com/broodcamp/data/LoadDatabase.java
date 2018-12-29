package com.broodcamp.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.broodcamp.data.entity.Employee;
import com.broodcamp.data.entity.Order;
import com.broodcamp.data.entity.Status;
import com.broodcamp.data.repository.EmployeeRepository;
import com.broodcamp.data.repository.OrderRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Edward P. Legaspi
 */
@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(final EmployeeRepository repository, final OrderRepository orderRepository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));

			orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
			orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

			orderRepository.findAll().forEach(order -> {
				log.info("Preloaded " + order);
			});
		};
	}

}
