package com.ibm.userregistration.infra.documents;

import lombok.Data;

@Data
public class AddressDocument {
	private String id;
	private String zipCode;
	private String state;
	private String city;
	private String address;
	private String number;
	private String complement;
}
