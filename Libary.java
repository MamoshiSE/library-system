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

		}
	}

	public void retrieveCustomer(int libraryCard) {
		if (checkCustomerId(libraryCard) == true) {

			System.out.println(this.customers.get(customerIndex(libraryCard)).getName());
			System.out.println("empty");

		}

		else {
			System.out.println("does not exist");

		}
	}

	public void retrieveCustomerHistory(int libraryCard) {

		if (checkCustomerId(libraryCard) == true) {
			
			for (int i = 0; i < retrieveCustomerObject(libraryCard).loanedBooks.size(); i++) 
			{
			System.out.println(retrieveCustomerObject(libraryCard).loanedBooks.get(i).getTitle());

		}
		}

		else {
			System.out.println("does not exist");

		}
	}

	public Books retrieveBookObject(int bookId) {
		Books found = books.get(bookIndex(bookId));
		return found;

	}
	
	public Books retrieveBookObjectBorrowed(int bookId) {
		Books found = borrowedBooks.get(borrowedBookIndex(bookId));
		return found;

	}

	public Customer retrieveCustomerObject(int libraryCard) {
		
			Customer found = customers.get(customerIndex(libraryCard));
			return found;
	}
	
	

	public void addBorrowedBook(int bookId) {

		borrowedBooks.add(retrieveBookObject(bookId));
		books.get(bookIndex(bookId)).addCounter();
		books.remove(bookIndex(bookId));

	}
	
	public void returnBorrowedBook(int bookId) {
		
		books.add(retrieveBookObjectBorrowed(bookId));
		borrowedBooks.remove(borrowedBookIndex(bookId));
	}
	
	public void bookStatistics() {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTitle() + " has been borrowed out: " + books.get(i).getCounter() + " times");
		}
	}

	public boolean checkCustomerId(int libaryCard) {
		boolean check = false;
		for (int i = 0; i < customers.size(); i++) {

			if (customers.get(i).getLibaryCard() == libaryCard) {
				check = true;

			}

		}
		return check;
	}

	public int customerIndex(int libaryCard) {

		for (int i = 0; i < customers.size(); i++) {

			if (customers.get(i).getLibaryCard() == libaryCard) {
				return i;

			}

		}
		return -1;
	}

	public boolean checkbookId(int bookId) {
		boolean check = false;
		for (int i = 0; i < books.size(); i++) {

			if (books.get(i).getId() == bookId) {
				check = true;

			}

		}
		return check;
	}

	public int bookIndex(int bookId) {

		for (int i = 0; i < books.size(); i++) {

			if (books.get(i).getId() == bookId) {
				return i;

			}

		}
		return -1;
	}
	
	public int borrowedBookIndex(int bookId) {

		for (int i = 0; i < borrowedBooks.size(); i++) {

			if (borrowedBooks.get(i).getId() == bookId) {
				return i;

			}

		}
		return -1;
	}
	
	public int customerBookIndex(int libraryCard, int bookId) {

		for (int i = 0; i < retrieveCustomerObject(libraryCard).loanedBooks.size(); i++) {

			if (retrieveCustomerObject(libraryCard).loanedBooks.get(i).getId() == bookId) {
				return i;

			}

		}
		return -1;
	}
}
