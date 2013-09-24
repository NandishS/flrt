package com.fmac.test;

import java.util.Scanner;

public class AddressDemo {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		//prompt for user inputs and store in to address object
		createInfo();
	}

	public static void createInfo() {
		System.out.print("Enter your name. ");
		String name;

		name = keyboard.next();
		
		System.out.print("Enter your Street number. ");
		int streetNumb;

		streetNumb = keyboard.nextInt();
		
		System.out.print("Enter your zip code. ");
		int zipCode;

		zipCode = keyboard.nextInt();
		
		System.out.print("Enter your city and state. ");
		String location;

		location = keyboard.next();
		
		System.out.print("Enter your street name. ");
		String streetName;

		streetName = keyboard.next();
		
		Address record = new Address(name,streetNumb,zipCode,location,streetName);
		
		System.out.println(record + " is created on DB.");

	}

	public static void retrieveInfo() {

	}

	public static void updateInfo() {

	}

	public static void deleteInfo() {

	}

}