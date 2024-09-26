package com.borntocode.builder;

import java.time.LocalDate;
import java.time.Period;

import com.borntocode.dto.UserDTO;
import com.borntocode.dto.UserWebDTO;
import com.borntocode.pojo.Address;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO userWebDTO;

	@Override
	public UserDTOBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate birthdate) {
		Period ageInYears = Period.between(birthdate, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + " , " + address.getStreet() + " , " + address.getCity() + " , "
				+ address.getState() + " , " + address.getState() + " , " + address.getZipcode();
		return this;
	}

	@Override
	public UserDTO build() {
		userWebDTO = new UserWebDTO(firstName + " " + lastName, address, age);
		return userWebDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return userWebDTO;
	}

}
