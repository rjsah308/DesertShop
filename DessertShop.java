package DessertShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DessertShop {

	private static DessertItem userPromptCandy() {
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter candy name: ");
		String candyName = in.nextLine();
		System.out.print("Enter candy weight: ");
		double weight;
		userInput = in.nextLine();
		weight = Double.parseDouble(userInput);
		System.out.print("Enter price per pound: ");
		double pricePerPound;
		userInput = in.nextLine();
		pricePerPound = Double.parseDouble(userInput);
		return new Candy(candyName, weight, pricePerPound);
	}

	private static DessertItem userPromptCookie() {
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter cookie name: ");
		String cookieName = in.nextLine();
		System.out.print("Enter cookie quantity: ");
		int qty;
		userInput = in.nextLine();
		qty = Integer.parseInt(userInput);
		System.out.print("Enter price per dozen: ");
		double pricePerDozen;
		userInput = in.nextLine();
		pricePerDozen = Double.parseDouble(userInput);
		return new Cookie(cookieName, qty, pricePerDozen);
	}

	private static DessertItem userPromptIceCream() {
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter icecream name: ");
		String iceCreamName = in.nextLine();
		System.out.print("Enter scoop count: ");
		int scoopCount;
		userInput = in.nextLine();
		scoopCount = Integer.parseInt(userInput);
		System.out.print("Enter price per scoop: ");
		double pricePerScoop;
		userInput = in.nextLine();
		pricePerScoop = Double.parseDouble(userInput);
		return new IceCream(iceCreamName, scoopCount, pricePerScoop);
	}

	private static DessertItem userPromptSundae() {
		Scanner in = new Scanner(System.in);
		String userInput;
		System.out.print("Enter icecream name: ");
		String iceCreamName = in.nextLine();
		System.out.print("Enter scoop count: ");
		int scoopCount;
		userInput = in.nextLine();
		scoopCount = Integer.parseInt(userInput);
		System.out.print("Enter price per scoop: ");
		double pricePerScoop;
		userInput = in.nextLine();
		pricePerScoop = Double.parseDouble(userInput);
		System.out.print("Enter candy name: ");
		String toppingName = in.nextLine();
		System.out.print("Enter toppingPrice: ");
		double toppingPrice;
		userInput = in.nextLine();
		toppingPrice = Double.parseDouble(userInput);
		return new Sundae(iceCreamName, scoopCount, pricePerScoop, toppingName, toppingPrice);
	}

	private static HashMap<String, Customer> customerDB = new HashMap<>();

	public static void addCustomer(String name, Customer customer) {
		customerDB.put(name, customer);
	}

	public static Customer getCustomer(String name) {
		return customerDB.get(name);
	}

	public static void main(String[] args) {

		boolean closed = false;

		while (!closed) {

			Order dessert37 = new Order();
			Scanner sIn = new Scanner(System.in);
			String choice;
			DessertItem orderItem;
			String paymentMethod = "";

			boolean done = false;
			while (!done) {
				System.out.println("\n1: Candy");
				System.out.println("2: Cookie");
				System.out.println("3: Ice Cream");
				System.out.println("4: Sunday");
				System.out.println("5: Admin Module");

				System.out.print("\nWhat would you like to add to the order? (1-4, Enter for done): ");
				choice = sIn.nextLine();

				if (choice.equals("")) {
					done = true;
				} else {
					switch (choice) {
					case "1":
						orderItem = userPromptCandy();
						dessert37.addDessert(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "2":
						orderItem = userPromptCookie();
						dessert37.addDessert(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "3":
						orderItem = userPromptIceCream();
						dessert37.addDessert(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "4":
						orderItem = userPromptSundae();
						dessert37.addDessert(orderItem);
						System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
						break;
					case "5":
						AdminModule();
						break;
					default:
						System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
						break;
					}// end of switch (choice)
				} // end of if (choice.equals(""))
			} // end of while (!done)
			System.out.println("\n");

			Candy c1 = new Candy("Candy Corn", 1.5, .25);
			dessert37.addDessert(c1);
			Candy c2 = new Candy("Gummy Bears", .25, .35);
			dessert37.addDessert(c2);
			Cookie ck1 = new Cookie("Chocolate Chip", 6, 3.99);
			dessert37.addDessert(ck1);
			IceCream i1 = new IceCream("Pistachio", 2, .79);
			dessert37.addDessert(i1);
			Sundae s1 = new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29);
			dessert37.addDessert(s1);
			Cookie ck2 = new Cookie("Oatmeal Raisin", 2, 3.45);
			dessert37.addDessert(ck2);

			boolean pay = false;
			while (!pay) {
				System.out.print("\nWhat form of payment will be used? (CASH, CARD, PHONE): ");
				paymentMethod = sIn.nextLine();
				for (Payable.PayType type : Payable.PayType.values()) {
					if (paymentMethod.toUpperCase().equals(type.name())) {
						dessert37.setPayType(type);
						paymentMethod = type.name();
					}
				} // end of for
				switch (paymentMethod) {
				case "CASH":
					pay = true;
					break;
				case "CARD":
					pay = true;
					break;
				case "PHONE":
					pay = true;
					break;
				default:
					System.out.println("That's not a valid form of payment.");
					break;
				}// end of switch
			} // end of while
			String customerName = "";
			System.out.println("Enter the customer name: ");
			customerName = sIn.nextLine();

			if (!customerDB.containsKey(customerName)) {
				Customer cust = new Customer(customerName);
				customerDB.put(customerName, cust);
				cust.setCustName(customerName);
				customerDB.get(customerName).addToHistory(dessert37);
			} // end of if statement
			else {
				customerDB.get(customerName).addToHistory(dessert37);
			} // end of else statement.

			
			Collections.sort(dessert37.getOrder());
			System.out.println(dessert37);
			System.out.printf("Customer Name: %s        Customer ID: %d%n  Total Orders: %d %n",
					customerDB.get(customerName).getCustName(), customerDB.get(customerName).getCustID(),
					customerDB.get(customerName).getOrderHistory().size());
			
			System.out.println("Hit enter to start a new order");
			String answer = sIn.nextLine();
			if (answer.equalsIgnoreCase("")) {
				closed = false;
			} else {
				closed = true;
			}

		} // end of close while loop
	}// main
	
	public static void AdminModule() {

		Scanner sIn = new Scanner(System.in);
		ArrayList<String> listName = new ArrayList<String>(customerDB.keySet());

		String choice = "";
		boolean valid2 = false;
		while (!valid2) {
			System.out.println("\n1: Shop Customer List" + "\n2: Customer Order History" + "\n3: Best Customer"
					+ "\n4: Exit Admin Module" + "\n\nWhat would you like to do?(1-4): ");

			choice = sIn.nextLine();

			switch (choice) {
			case "1":

				for (String cusName : listName) {
					System.out.printf("Customer Name: %s Customer ID: %d\n", customerDB.get(cusName).getCustName(),
							customerDB.get(cusName).getCustID());
				} // end of for loop
				break;

			case "2":
				String name;
				System.out.println("Enter the name of the customer: ");
				name = sIn.nextLine();

				if (customerDB.containsKey(name)) {
					for (int i = 0; i < customerDB.get(name).getOrderHistory().size(); i++) {

						System.out.println("-------------------------------------------");
						System.out.printf("Order #%d", i + 1);
						System.out.println("\n-------------------------------------------");
						System.out.println(customerDB.get(name).getOrderHistory().get(i));

					} // end of for loop
				} else {
					System.out.println("Error. Please enter the customer name again.");

				} // end of else statement

				break;
			case "3":

				String MVC = "";
				double comp = customerDB.get(listName.get(0)).getOrderHistory().get(0).orderCost();

				for (String ValueName : listName) {
					double sum = 0;

					for (int j = 0; j < customerDB.get(ValueName).getOrderHistory().size(); j++) {
						sum += customerDB.get(ValueName).getOrderHistory().get(j).orderCost();
					}
					if (sum > comp) {
						comp = sum;
						MVC = ValueName;
					} // end of if statement.

				} // end of for each loop.
				System.out.printf("The Dessert Shop's most valued customer is: %s %n", customerDB.get(MVC).getCustName());
				break;
			case "4":
				valid2 = true;
				break;

			}// end of switch
		} // end of while loop

	}

}// class
