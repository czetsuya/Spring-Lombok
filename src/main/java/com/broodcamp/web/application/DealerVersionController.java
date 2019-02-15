package com.broodcamp.web.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.broodcamp.business.domain.DealerV1;
import com.broodcamp.business.domain.DealerV2;
import com.broodcamp.data.entity.Name;

/**
 * Using version in parameter is useful for bookmarking.
 * 
 * @author Edward P. Legaspi
 */
@RestController
public class DealerVersionController {

	@GetMapping("v1/dealer")
	public DealerV1 dealerV1() {
		return new DealerV1("Kerri Legaspi");
	}

	@GetMapping("v2/dealer")
	public DealerV2 dealerV2() {
		return new DealerV2(new Name("Kerri", "Legaspi"));
	}

	@GetMapping(value = "/dealer/param", params = "version=1")
	public DealerV1 paramV1() {
		return new DealerV1("Kerri Legaspi");
	}

	@GetMapping(value = "/dealer/param", params = "version=2")
	public DealerV2 paramV2() {
		return new DealerV2(new Name("Kerri", "Legaspi"));
	}

	@GetMapping(value = "/dealer/header", headers = "X-API-VERSION=1")
	public DealerV1 headerV1() {
		return new DealerV1("Kerri Legaspi");
	}

	@GetMapping(value = "/dealer/header", headers = "X-API-VERSION=2")
	public DealerV2 headerV2() {
		return new DealerV2(new Name("Kerri", "Legaspi"));
	}

	@GetMapping(value = "/dealer/produces", produces = "application/vnd.company.app-v1+json")
	public DealerV1 producesV1() {
		return new DealerV1("Kerri Legaspi");
	}

	@GetMapping(value = "/dealer/produces", produces = "application/vnd.company.app-v2+json")
	public DealerV2 producesV2() {
		return new DealerV2(new Name("Kerri", "Legaspi"));
	}
	
}
