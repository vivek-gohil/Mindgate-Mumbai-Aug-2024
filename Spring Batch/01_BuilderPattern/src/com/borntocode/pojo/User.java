package com.borntocode.pojo;

import java.time.LocalDate;

public class User {
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private Address address;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, LocalDate birthdate, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", birthdate=" + birthdate + ", address="
				+ address + "]";
	}

}
