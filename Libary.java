package Libary;

import java.util.ArrayList;





public class Libary {
	ArrayList<Customer> customers;

	public Libary() {

		this.customers = new ArrayList<Customer>();

	}
	
	public void addCustomer(String name, int libaryCard, int phoneNumber, String streetName, String streetNum, String zipCode, String city, String country) {

		Customer cus = new Customer(name, libaryCard, phoneNumber, streetName, streetNum, zipCode, city, country);
		
			this.customers.add(cus);

		}
	}
	


