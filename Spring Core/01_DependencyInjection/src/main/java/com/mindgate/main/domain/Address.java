package com.mindgate.main.domain;

public class Address {
	private int addressId;
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private int pin;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String houseNumber, String street, String city, String state, int pin) {
		super();
		this.addressId = addressId;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", street=" + street + ", city="
				+ city + ", state=" + state + ", pin=" + pin + "]";
	}

}
