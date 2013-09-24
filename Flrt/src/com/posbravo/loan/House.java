package com.posbravo.loan;

public class House {
	private String houseNum;
	private String houseAddress;
	public House() {
		super();
	}
	public House(String houseNum, String houseAddress) {
		this.houseNum = houseNum;
		this.houseAddress = houseAddress;
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}
	
	
}
