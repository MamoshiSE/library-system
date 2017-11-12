package Libary;

public class Customer {
	
	private String name;
	private int libaryCard;
	private int phoneNumber;
	private Address address;
	


Customer (String name, int libaryCard, int phoneNumber, String streetName, String streetNum, String zipCode, String city, String country) {
	this.name = name;
	this.libaryCard = libaryCard;
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
