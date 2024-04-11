package DessertShop;

public class Candy extends DessertItem implements SameItem<Candy> {

	// Attribute
	private double candyWeight;
	private double pricePerPound;

	// Constructor

	public Candy() {
		super();
		candyWeight = 0;
		pricePerPound = 0;
		setPackaging("");
	}

	public Candy(String n, double candy, double price) {
		super(n);
		candyWeight = candy;
		pricePerPound = price;
		setPackaging("Bag");
	}

	// Method

	public double getCandyWeight() {
		return candyWeight;
	}

	public void setCandyWeight(double candyWeight) {
		this.candyWeight = candyWeight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}

	public double calculateCost() {
		return getCandyWeight() * getPricePerPound();
	}

	public double calculateTax() {
		return calculateCost() * getTaxPercent() / 100;
	}
	public boolean isSameAS(Candy other) {
		if (this.getName().equals(other.getName()) && this.pricePerPound == other.pricePerPound) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String name = String.format("%s (%s)", getName(), getPackaging());
		String line1 = String.format("%.2f lbs.", candyWeight);
		String line2 = String.format("@%.2f/lb :", pricePerPound);
		String line3 = String.format("$%-10.2f [Tax : $%.2f]", calculateCost(), calculateTax());
		String outputVar = String.format("%s\n\t%-25s%s%17s", name, line1, line2, line3);
		return outputVar;
	}

	public void addWeight(double weight) {
	    candyWeight += weight;
	}


}
