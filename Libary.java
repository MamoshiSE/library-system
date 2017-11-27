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
	
	public void retrieveBorrowedBookList() {
		for (int i = 0; i < borrowedBooks.size(); i++) {
			System.out.print(borrowedBooks.get(i).getTitle());
			System.out.print("test");

		}
	}
	
	public void retrieveCustomerHistory(int libraryCard) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getLibaryCard() == (libraryCard)) {
				System.out.println(this.customers.get(i).getBookHistory());
			}
		}
	}
	
	
	
	public void borrowBook(int bookId) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == (bookId)) {
				borrowedBooks.add(books.get(i));
				books.remove(i);				
			}
		}
		
		/*for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getLibaryCard() == (libaryCard)) {
				for (int j = 0; j < books.size(); j++) {
					if (books.get(j).getId() == (bookId)) {
						
						borrowedBooks.add(books.get(j));
						customers.get(i).addLoanedBooks(books.get(j));
						
						// books.remove(j);
					} else {
						System.out.println("Cant find book");
					}
					}
			} else {
				System.out.println("Cant find customer");
			}
			
		} */
		
	} 
}
