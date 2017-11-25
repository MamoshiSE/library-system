package Libary;

import java.util.ArrayList;

public class Libary {
	ArrayList<Customer> customers;
	ArrayList<Books> books;
	ArrayList<Books> borrowedBooks;

	public Libary() {

		this.customers = new ArrayList<Customer>();
		this.books = new ArrayList<Books>();
		this.borrowedBooks = new ArrayList<Books>();

	}

	public void addCustomer(String name, int phoneNumber, String streetName, int streetNum, int zipCode, String city,
			String country) {

		Customer cus = new Customer(name, phoneNumber, streetName, streetNum, zipCode, city, country);

		this.customers.add(cus);

	}

	public void addBook(String title, String author, String genre, String publisher, char shelf) {
		Books book = new Books(title, author, genre, publisher, shelf);
		this.books.add(book);
	}

	public void retrieveBookList() {
		for (int i = 0; i < books.size(); i++) {
			System.out.print(books.get(i).getTitle());
		}
	}
	
	public void BorrowBook(String name)
	{
		// this.customers.setName(name);
	}
}
