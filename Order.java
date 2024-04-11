package DessertShop;

import java.util.ArrayList;

public class Order implements Payable{
	
	//Attribute
	private ArrayList<DessertItem> dessert;
	private PayType payMethod;

	//Constructor
	public Order () {
		dessert = new ArrayList<DessertItem>();
		payMethod = PayType.CASH;
	}
	//Methods
	public void addDessert(DessertItem d) {
	    if (d instanceof Candy) {
	        Candy newCandy = (Candy) d;
	        for (DessertItem item : dessert) {
	            if (item instanceof Candy && ((Candy) item).isSameAS(newCandy)) {
	                ((Candy) item).addWeight(newCandy.getCandyWeight());
	                return;
	            }
	        }
	    }
	    if (d instanceof Cookie) {
	        Cookie newCookie = (Cookie) d;
	        for (DessertItem item : dessert) {
	            if (item instanceof Cookie && ((Cookie) item).isSameAS(newCookie)) {
	                ((Cookie) item).addQty(newCookie.getCookieQty());
	                return;
	            }
	        }
	    }
		dessert.add(d);
	}
	public int itemCount() {
		return dessert.size();
	}
	public ArrayList<DessertItem> getOrder() {
		return dessert;
	}
	public double orderCost() {
	    double total = 0;
	    for (DessertItem item : dessert) {
	      total += item.calculateCost();
	    }
	    return total;
	}

	public PayType getPayType() {
		return payMethod;
	}
	public void setPayType(PayType payType) {
		this.payMethod = payType;
	}
	
	public String toString() {
		double subtotal = 0;
	    double totalTax = 0;
	    
	    
	    String finalOutput = "";
	    finalOutput += "---------------------Receipt------------------\n";
	    
	    for (DessertItem d : getOrder()) {
	    	finalOutput += d;
	    	finalOutput += "\n";
	    }
	    finalOutput += "----------------------------------------------\n";

	    for (DessertItem d: getOrder()) {
		      double itemTax1 = d.calculateCost() * d.getTaxPercent()/100;
		      subtotal += d.calculateCost();
		      totalTax += itemTax1;
		    }//for
	    	String subTotal = String.format("Order Subtotals: $%-8.2f [Tax:$%.2f]", subtotal, totalTax);
	    	String total = String.format("Order Total:     $%-8.2f\n", subtotal + totalTax);
	    	String items = String.format("Total items in the order: " + itemCount());
	    	String payment = String.format("\nPaid for with " + getPayType());
	    	String line = String.format("\n\n----------------------------------------------");
	    	String output = String.format("%s\n%s%s%s%s\n\n", subTotal, total, items, line ,payment);
		    return finalOutput + output;
	}
	

}
