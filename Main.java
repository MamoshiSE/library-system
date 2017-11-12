package Libary;

import java.util.Scanner;






public class Main {
	Libary Customer = new Libary();
	Scanner input = new Scanner(System.in);
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Register customers's name?");

			String name = input.nextLine();

			System.out.println("Register Customers Libary Card ID?");
			int libaryCard = input.nextInt();

			System.out.println("Register Customer's phone Number?");
			int phoneNumber = input.nextInt();

			System.out.println("Customer's Street Name?");
			String streetName = input.nextLine();
			
			System.out.println("Customer's Street Name?");
			String streetNum = input.nextLine();
			
			System.out.println("Customer's Street Name?");
			String zipCode = input.nextLine();
			
			System.out.println("Customer's Street Name?");
			String city = input.nextLine();
			
			System.out.println("Customer's Street Name?");
			String country = input.nextLine();

			addCustomer(name, libaryCard, phoneNumber, streetName, streetNum, zipCode, city, country);
}
		
		
}
