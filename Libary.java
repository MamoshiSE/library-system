package Libary;

import java.util.ArrayList;





public class Libary {
	ArrayList<Customer> customers;

	public Libary() {

		this.customers = new ArrayList<Customer>();

	}
	
	public void addCustomer(String name, int phoneNumber, String streetName, int streetNum, int zipCode, String city, String country) {

		Customer cus = new Customer(name, phoneNumber, streetName, streetNum, zipCode, city, country);
		
			this.customers.add(cus);

		}
	}
	


