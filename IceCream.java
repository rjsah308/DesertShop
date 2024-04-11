package DessertShop;

public class IceCream extends DessertItem{
	
	//Attribute
	private int scoopCount;
	private double pricePerScoop;
	
	//Constructor
	public IceCream() {
		super();
		scoopCount = 0;
		pricePerScoop = 0;
		setPackaging("");
	}
	
	public IceCream(String n, int count, double price) {
		super(n);
		scoopCount = count;
		pricePerScoop = price;
		setPackaging("Bowl");
	}

	//Method
	
	public int getScoopCount() {
		return scoopCount;
	}

	public void setScoopCount(int scoopCount) {
		this.scoopCount = scoopCount;
	}

	public double getPricePerScoop() {
		return pricePerScoop;
	}

	public void setPricePerScoop(double pricePerScoop) {
		this.pricePerScoop = pricePerScoop;
	}
	
	public double calculateCost() {
	    return getScoopCount() * getPricePerScoop();
	}

	public double calculateTax() {
	    return calculateCost() * getTaxPercent() / 100;
	}
	
	public String toString() {
		String name = String.format("%s (%s)", getName(), getPackaging());
		String line1 = String.format("%d scoop.", scoopCount);
		String line2 = String.format("@%.2f/lb :", pricePerScoop);
		String line3 = String.format("$%-10.2f [Tax : $%.2f]", calculateCost(), calculateTax());
		String outputVar = String.format("%s\n\t%-25s%s%17s", name, line1, line2, line3);
		return outputVar;	
	}
	

}
