package com.broodcamp.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.broodcamp.data.entity.Customer;
import com.broodcamp.data.entity.Employee;
import com.broodcamp.data.entity.Order;
import com.broodcamp.data.entity.Product;
import com.broodcamp.data.entity.ProductRating;
import com.broodcamp.data.entity.Status;
import com.broodcamp.data.repository.CustomerRepository;
import com.broodcamp.data.repository.EmployeeRepository;
import com.broodcamp.data.repository.OrderRepository;
import com.broodcamp.data.repository.ProductRatingRepository;
import com.broodcamp.data.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Edward P. Legaspi
 */
@Configuration
@Slf4j
public class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(final EmployeeRepository repository, final OrderRepository orderRepository, final CustomerRepository customerRepository,
			final ProductRepository productRepository, final ProductRatingRepository productRatingRepository) {
		return args -> {
			log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
			log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));

			orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
			orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

			orderRepository.findAll().forEach(order -> {
				log.info("Preloaded " + order);
			});

			Customer c1 = new Customer("Kira", "Yamato");
			log.info("Preloading " + customerRepository.save(c1));
			Customer c2 = new Customer("Lacus", "Clyne");
			log.info("Preloading " + customerRepository.save(c2));

			Product p1 = productRepository.save(new Product("Gundam Freedom"));
			log.info("Preloading " + p1);
			Product p2 = productRepository.save(new Product("Gundam Justice"));
			log.info("Preloading " + p2);

			log.info("Preloading " + productRatingRepository.save(new ProductRating(p1, c1, 5)));
			log.info("Preloading " + productRatingRepository.save(new ProductRating(p2, c2, 3)));
		};
	}

}
