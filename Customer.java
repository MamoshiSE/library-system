package Libary;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	public static AtomicInteger count = new AtomicInteger(0);
	private String name;
	private int libaryCard;
	private int phoneNumber;
	private Address address;
	


Customer (String name, int phoneNumber, String streetName, int streetNum, int zipCode, String city, String country) {
	this.name = name;
	this.libaryCard = count.incrementAndGet();
	this.phoneNumber = phoneNumber;
	this.address = new Address(streetName, streetNum, zipCode, city, country);

}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getLibaryCard() {
		return libaryCard;
	}



	public void setLibaryCard(int libaryCard) {
		this.libaryCard = libaryCard;
	}



	public int getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




}
