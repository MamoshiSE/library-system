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
	
	public void retrieveCustomerHistory(int libraryCard) {
		
			if (checkCustomerId(libraryCard) == true) {
				
				
					System.out.println(this.customers.get(customerIndex(libraryCard)).getLoanedBooks().toString());
					System.out.println("empty");
				
			}
				
			 else {
				System.out.println("does not exist");

			}
	}
	
	
	
	
	public void borrowBook(int libraryCard, int bookId) {
		
		/* 	if (checkbookId(bookId) == true) {
				
				borrowedBooks.add(books.get(bookIndex(bookId)));
				System.out.println("Book borrowed");
				books.remove(bookIndex(bookId));	
				
			} else {
				System.out.println("not found");

			}
		} */
		
		
		//	if (checkCustomerId(libraryCard) == true) {
			//	if (checkbookId(bookId) == true) {
					
						borrowedBooks.add(books.get(bookIndex(bookId)));
						customers.get(customerIndex(libraryCard)).loanedBooks.add(books.get(bookIndex(bookId)));;
						System.out.println("Book borrowed");
						books.remove(bookIndex(bookId));
				//	} else {
			//			System.out.println("Cant find book");
				//	}
					
		//	} else {
		
		//		System.out.println("Cant find customer");
		//	}
			
		} 
		
		
		
	
	
	public boolean checkCustomerId (int libaryCard) {
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
	
	public boolean checkbookId (int bookId) {
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
}
