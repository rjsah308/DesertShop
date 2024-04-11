package DessertShop;

public class Sundae extends IceCream{
	
	//Attribute
	private String toppingName;
	private double toppingPrice;
	
	//Constructor
	public Sundae() {
		super();
		toppingName = "";
		toppingPrice = 0;
		setPackaging("Boat");
	}
	
	public Sundae(String n, int count, double price, String topping, double toppingPrice) {
		super(n, count, price);
		this.toppingName = topping;
		this.toppingPrice = toppingPrice;
		setPackaging("Boat");
	}
	
	
	//Method
	public String getToppingName() {
		return toppingName;
	}

	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}

	public double getToppingPrice() {
		return toppingPrice;
	}

	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	public double calculateCost() {
	    double iceCreamCost = super.getScoopCount() * super.getPricePerScoop();
	    double total = iceCreamCost + toppingPrice;
	    return total;
	}

	public double calculateTax() {
	    return calculateCost() * getTaxPercent() / 100;
	}
	
	public String toString() {
		String name = String.format("%s (%s)", getName(), getPackaging());
		String line1 = String.format("%d scoop.", super.getScoopCount());
		String line2 = String .format("@%.2f/sc", super.getPricePerScoop());
		String line3 = String .format("%s", toppingName);
		String line4 = String .format("@%.2f :", toppingPrice); 
		String line5 = String.format("$%-10.2f [Tax : $%.2f]", calculateCost(), calculateTax());
		String outputVar = String.format("%s\n\t%-25s%-10s \n\t%-25s%-10s%-10s", name, line1, line2, line3, line4, line5);
		return outputVar;	
	}
	


}
