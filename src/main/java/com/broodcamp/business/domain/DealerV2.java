package com.broodcamp.business.domain;

import com.broodcamp.data.entity.Name;

/**
 * @author Edward P. Legaspi
 */
public class DealerV2 {

	private Name name;

	public DealerV2() {
	}

	public DealerV2(Name name) {
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

}
