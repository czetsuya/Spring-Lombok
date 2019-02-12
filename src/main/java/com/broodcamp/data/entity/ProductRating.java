package com.broodcamp.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edward P. Legaspi
 */
@NoArgsConstructor
@Entity
@Data
@Table(name = "product_rating")
public class ProductRating {

	private @Id @GeneratedValue Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "product_id", nullable = false, updatable = false)
	private Product product;

	@ManyToOne(optional = false)
	@JoinColumn(name = "customer_id", nullable = false, updatable = false)
	private Customer customer;

	@Column
	private Integer rating;

	public ProductRating(Product product, Customer customer, Integer rating) {
		this.product = product;
		this.customer = customer;
		this.rating = rating;
	}

}
