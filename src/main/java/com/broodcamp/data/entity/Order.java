package com.broodcamp.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edward P. Legaspi
 */
@NoArgsConstructor
@Entity
@Data
@Table(name = "customer_order")
public class Order {

	private @Id @GeneratedValue Long id;

	private String description;
	private Status status;

	public Order(String description, Status status) {

		this.description = description;
		this.status = status;
	}

}
