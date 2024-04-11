package DessertShop;

public class Cookie extends DessertItem implements SameItem<Cookie>{
	
	//Attribute
	private int cookieQty;
	private double pricePerDozen;
	//Constructor
	public Cookie() {
		super();
		cookieQty = 0;
		pricePerDozen = 0;
		setPackaging("");
	}
	
	public Cookie(String n, int cookie, double ppd) {
		super(n);
		cookieQty = cookie;
		pricePerDozen = ppd;
		setPackaging("Box");
	}

	//Method
	
	public int getCookieQty() {
		return cookieQty;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}

	public void setCookieQty(int cookieQty) {
		this.cookieQty = cookieQty;
	}
	
	public double calculateCost() {
	    return (cookieQty / 12.0) * pricePerDozen;
	}

	public double calculateTax() {
	    return calculateCost() * getTaxPercent() / 100;
	}
	public boolean isSameAS(Cookie other) {
		if (this.getName().equals(other.getName()) && this.pricePerDozen == other.pricePerDozen) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String name = String.format("%s (%s)", getName(),getPackaging());
		String line1 = String.format("%d qty.", cookieQty);
		String line2 = String.format("@%.2f/lb :", pricePerDozen);
		String line3 = String.format("$%-10.2f [Tax : $%.2f]", calculateCost(), calculateTax());
		String outputVar = String.format("%s\n\t%-25s%s%17s", name, line1, line2, line3);
		return outputVar;	
		}
	
	public void addQty(int Qty) {
	    cookieQty += Qty;
	}
	
	

}
