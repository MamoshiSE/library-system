package Libary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

public class Main {

	Libary Customer = new Libary();
	Libary Books = new Libary();
	Scanner input = new Scanner(System.in);

	public void run() {

		int option;

		do {

			menu();
			System.out.print(" Type the option number: ");

			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case 1:
				registerCustomer();
				break;

			case 2:
				addBook();
				break;

			case 3:
				Books.retrieveBookList();
				break;

			case 4:

				Books.retrieveBorrowedBookList();
				break;
				
			case 5:
				//System.out.println("What's your libary card ID?");
				//int libaryId = input.nextInt();
				
				System.out.println("What's the ID of the book you want to borrow?");
				int bookID = input.nextInt();
				Books.borrowBook(bookID);
				break;
				
			case 6: 
				System.out.println("What's the customers libary ID?");
				int libraryCard = input.nextInt();
				Books.retrieveCustomerHistory(libraryCard);
				break;
			}

		} while (option != 8);

	}

	public static void menu() {
		System.out.println(" ");
		System.out.println(" === Welcome to the Libary System === ");
		System.out.println(" Choose an option below: ");
		System.out.println(" ");
		System.out.println(" 1. Register a customer. ");
		System.out.println(" 2. Register a book. ");
		System.out.println(" 3. Retrieve book list. ");
		System.out.println(" 4. Retrieve borrowed book list. ");
		System.out.println(" 5. Borrow a book. ");
		System.out.println(" 6. Retrieve customer book history. ");

	}

	public void registerCustomer() {
		Scanner input = new Scanner(System.in);

		System.out.println("Register customers's name?");
		String name = input.nextLine();

		System.out.println("Register Customer's phone Number?");
		int phoneNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("Customer's Street Name?");
		String streetName = input.nextLine();

		System.out.println("Customer's Street Number?");
		int streetNum = input.nextInt();
		input.nextLine();

		System.out.println("Customer's Zip Code?");
		int zipCode = input.nextInt();
		input.nextLine();

		System.out.println("Customer's City?");
		String city = input.nextLine();

		System.out.println("Customer's Country?");
		String country = input.nextLine();

		Customer.addCustomer(name, phoneNumber, streetName, streetNum, zipCode, city, country);
	}

	public void addBook() {
		System.out.println("Register book title?");
		String title = input.nextLine();

		System.out.println("What's the name of the author?");
		String author = input.nextLine();

		System.out.println("What genre is it?");
		String genre = input.nextLine();

		System.out.println("Name of the publisher?");
		String publisher = input.nextLine();

		System.out.println("Which book shelf is it in?");
		char shelf = input.next().charAt(0);

		Books.addBook(title, author, genre, publisher, shelf);

	}

	public static void readFileLineByLine(String fileName) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main program = new Main();
		program.run();
	}

}
