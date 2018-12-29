package com.broodcamp.web.assembler;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;

import com.broodcamp.data.entity.Order;
import com.broodcamp.data.entity.Status;
import com.broodcamp.web.application.OrderController;

/**
 * @author Edward P. Legaspi
 */
@Component
public class OrderResourceAssembler implements ResourceAssembler<Order, Resource<Order>> {

	@Override
	public Resource<Order> toResource(Order order) {

		// Unconditional links to single-item resource and aggregate root

		Resource<Order> orderResource = new Resource<>(order,
				linkTo(methodOn(OrderController.class).one(order.getId())).withSelfRel(),
				linkTo(methodOn(OrderController.class).all()).withRel("orders"));

		// Conditional links based on state of the order

		if (order.getStatus() == Status.IN_PROGRESS) {
			orderResource.add(linkTo(methodOn(OrderController.class).cancel(order.getId())).withRel("cancel"));
			orderResource.add(linkTo(methodOn(OrderController.class).complete(order.getId())).withRel("complete"));
		}

		return orderResource;
	}
}
