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
@Table(name = "product")
public class Product {
	private @Id @GeneratedValue Long id;
	private String name;

	public Product(String name) {
		this.name = name;
	}
}
