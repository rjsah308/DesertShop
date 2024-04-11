package DessertShop;

public abstract class DessertItem implements pacakaging, Comparable<DessertItem>{
	
	//Attribute
	private String name;
	private double taxPercent = 7.25;
	protected String packaging;
	//Constructor
	
	public DessertItem() {
		name = "";
	}
	
	public DessertItem(String n) {
		this.name = n;
	}
	
	//Method
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		
		name = n;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
	
	public void setTaxPercent(double tp) {
		taxPercent = tp;
	}
	
	public double calculateTax() {
		return calculateCost() * (taxPercent / 100);
	}
	
	public abstract double calculateCost();
	
	public String getPackaging() {
		return packaging;
	}
	public void setPackaging(String s) {
		packaging = s;
	}
	
	public int compareTo(DessertItem other) {
		if (this.calculateCost() < other.calculateCost()) {
			return -1;
		} else if (this.calculateCost() > other.calculateCost()) {
			return 1;
		} else {
			return 0;
		}
	}
}