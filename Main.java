package Libary;



import java.util.Scanner;

public class Main {

	Libary Customer = new Libary();
	Libary Books = new Libary();
	Scanner input = new Scanner(System.in);

	public void run() {
		
		
		Customer.addCustomer("Rakel", "03728409045", "Bygget", 82, 34013, "Ljungby", "Sweden");
		Customer.addCustomer("Esra", "01255223130", "Hagaskog", 89, 61024, "Östergötland", "Sweden");
		Books.addBook("Think and Grow Rich","Napoleon Hill", "Self-help", "The Ralston Society", 'S');
		Books.addBook("Outliers", "Malcolm Gladwell", "Psychology", "Little, Brown and Company", 'P');
		Books.addBook("The Catcher in the Rye","J.D Salinger", "Realistic Fiction", "Little, Brown and Company", 'R');
		Books.addBook("The Lord of the Rings", "J. R. R. Tolkien", "Fantasy", "Allen & Unwin", 'F');
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
				borrowBook();
				
				break;

			case 4:
				returnBook();
				
				break;
				
			case 5:
				Books.retrieveBookList();
				break; 
				
				
			case 6: 
				
				Books.retrieveDelayedBookList();

				break;
				
				
			case 7: 
				System.out.println("What's the customers libary ID?");
				int libraryCard = input.nextInt();
				Customer.retrieveCustomerHistory(libraryCard);
				break;
				
				
			case 8: 
				Books.bookStatistics();
				break;
			}

		} while (option != 9);

	}

	public static void menu() {
		System.out.println(" ");
		System.out.println(" === Welcome to the Libary System === ");
		System.out.println(" Choose an option below: ");
		System.out.println(" ");
		System.out.println(" 1. Register a customer. ");
		System.out.println(" 2. Register a book. ");
		System.out.println(" 3. Borrow book. ");
		System.out.println(" 4. Return book. ");
		System.out.println(" 5. Retrieve book list. ");
		System.out.println(" 6. Retrieve delayed book list");
		System.out.println(" 7. Retrieve customer book history. ");
		System.out.println(" 8. Most borrowed books ");
		

	}

	public void registerCustomer() {
		Scanner input = new Scanner(System.in);

		System.out.println("Register customers's name?");
		String name = input.nextLine();

		System.out.println("Register Customer's phone Number?");
		String phoneNumber = input.nextLine();
		
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
	
	public void borrowBook() {
		System.out.println("What's your libary card ID?");
		int libraryCard = input.nextInt();
		
		System.out.println("What's the ID of the book you want to borrow?");
		int bookId = input.nextInt();
		input.nextLine();

		
		if (Customer.checkCustomerId(libraryCard) == true) {
			if (Books.checkbookId(bookId) == true) {
				if(Books.retrieveBookObject(bookId).getStatus() == "Available") {
				Customer.retrieveCustomerObject(libraryCard).addLoanedBooks(Books.retrieveBookObject(bookId));;
				System.out.println("(Book ID: " + bookId + ") " + Books.retrieveBookObject(bookId).getTitle() + " has been borrowed by the customer: " + Customer.retrieveCustomerObject(libraryCard).getName() + " (Customer ID: " + libraryCard +")");
				System.out.println("Book should be returned: " + Books.returnDate(bookId));
				Books.addBorrowedBook(bookId);
				}
				else {
					System.out.println("Book is currently borrowed");
				}
			} 
			else {
				System.out.println("Book not found");
			}
		}  else {
			System.out.println("Customer not found");

		}
	}
	
	public void returnBook() {
		System.out.println("What's the customers libary ID?");
		int libraryCard = input.nextInt();
		
		System.out.println("What's the ID of the book you want to return?");
		int bookId = input.nextInt();
		input.nextLine();
		int lateDays = Books.returnBorrowedBook(bookId);
		if (lateDays > 0) {
			Customer.retrieveCustomerObject(libraryCard).ChargeCustomer(Books.returnBorrowedBook(bookId));
			System.out.println("The book was returned " + lateDays + " days after due date.");
			System.out.println("The customer will have to pay: " + Customer.retrieveCustomerObject(libraryCard).getDebit() + " SEK fee.");
		}
		
		Books bookInfo = Books.retrieveBookObject(bookId);
		System.out.println("(Book ID: " + bookId + ") " + bookInfo.getTitle() + ", by " + bookInfo.getAuthor() + " has been returned to the library.");
	}



	public static void main(String[] args) {
		Main program = new Main();
		program.run();
	}

}
