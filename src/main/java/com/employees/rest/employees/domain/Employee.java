package com.employees.rest.employees.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Employee {

	private final Long id;
    private final String name;

    // Empty constructor for JSON (de)serialization
    protected Employee() {
    	id = null;
        name = null;
    }
	
}
