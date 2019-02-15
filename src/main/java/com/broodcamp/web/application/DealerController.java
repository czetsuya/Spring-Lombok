package com.broodcamp.web.application;

import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broodcamp.business.domain.DealerV2;
import com.broodcamp.business.exception.DealerNotFoundException;

/**
 * @author Edward P. Legaspi
 */
@RestController
@RequestMapping("/dealers")
public class DealerController {

	public DealerController() {
	}

	@GetMapping("/{id}")
	public Resource<DealerV2> findOne(@PathVariable Long id) {
		throw new DealerNotFoundException(id);
	}

}
