package DessertShop;

import java.util.ArrayList;

public class Customer {
	
	//Attribute
	private String custName;
	private ArrayList<Order> orderHistory;
	private int custID;
	private static int nextCustID = 1000;
	
	//Constructor
	public Customer(String custName) {
		this.custName = custName;
		orderHistory = new ArrayList<Order>();
		custID = nextCustID;
		nextCustID ++;
	}
	//Method
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public ArrayList<Order> getOrderHistory() {
		return orderHistory;
	}
	public void addToHistory(Order o){
		this.orderHistory.add(o);
	}
	public int getCustID() {
		return custID;
	}
	
	
}
