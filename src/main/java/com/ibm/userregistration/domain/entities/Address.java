package com.ibm.userregistration.domain.entities;

import lombok.Data;

@Data
public class Address {
	private String id;
	private String zipCode;
	private String state;
	private String city;
	private String address;
	private String number;
	private String complement;
}
