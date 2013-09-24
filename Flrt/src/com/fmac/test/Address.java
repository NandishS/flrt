package com.fmac.test;

public class Address {
	private int address_Numb;
	private int zipCode;
	private String location;
	private String streetName;
	private String name;

	public Address() {
		super();
	}

	public Address(String name, int address_numb, int zipCode, String location,
			String streetName) {

		this.name = name;
		this.address_Numb = address_numb;
		this.zipCode = zipCode;
		this.location = location;
		this.streetName = streetName;

	}

	public int getAddress_numb() {
		return address_Numb;
	}

	public void setAddress_numb(int address_numb) {
		this.address_Numb = address_numb;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Here are the information for [address_Numb=" + address_Numb + ", zipCode=" + zipCode
				+ ", location=" + location + ", streetName=" + streetName
				+ ", name=" + name + "]";
	}
	

}
