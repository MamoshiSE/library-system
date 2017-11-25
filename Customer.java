package Libary;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
	public static AtomicInteger count = new AtomicInteger(0);
	private String name;
	private int libaryCard;
	private int phoneNumber;
	private Address address;
	private ArrayList<Books> bookHistory;
	ArrayList<Books> loanedBooks;

	


Customer (String name, int phoneNumber, String streetName, int streetNum, int zipCode, String city, String country) {
	this.name = name;
	this.libaryCard = count.incrementAndGet();
	this.phoneNumber = phoneNumber;
	this.address = new Address(streetName, streetNum, zipCode, city, country);
	this.bookHistory = null;
	this.loanedBooks = null;
	

}




public static AtomicInteger getCount() {
	return count;
}




public static void setCount(AtomicInteger count) {
	Customer.count = count;
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




public Address getAddress() {
	return address;
}




public void setAddress(Address address) {
	this.address = address;
}




public ArrayList<Books> getBookHistory() {
	return bookHistory;
}




public void setBookHistory(ArrayList<Books> bookHistory) {
	this.bookHistory = bookHistory;
}




public ArrayList<Books> getLoanedBooks() {
	return loanedBooks;
}




public void setLoanedBooks(ArrayList<Books> loanedBooks) {
	this.loanedBooks = loanedBooks;
}


	



}
