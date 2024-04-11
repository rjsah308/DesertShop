package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest {
	Candy c = new Candy("Choo",100,5);
	@Test
	void testGetCandyWeight() {
		double candyWeight = c.getCandyWeight();
		assertEquals(candyWeight, 100);
	}

	@Test
	void testSetCandyWeight() {
		c.setCandyWeight(50);
		double candyWeight = c.getCandyWeight();
		assertEquals(candyWeight, 50);
	}

	@Test
	void testGetPricePerPound() {
		double pricePerPound = c.getPricePerPound();
		assertEquals(pricePerPound, 5);
	}

	@Test
	void testSetPricePerPound() {
		c.setPricePerPound(3);
		double pricePerPound = c.getPricePerPound();
		assertEquals(pricePerPound, 3);
	}
	@Test
	void testGetPackaging() {
		assertEquals(c.getPackaging(), "Bag");
	}

	@Test
	void testSetPackaging() {
		c.setPackaging("Paper Bag");
		assertEquals(c.getPackaging(), "Paper Bag");
	}
	@Test
	void testIsSameAsTrue() {
	    Candy candy1 = new Candy("Choco", 30, 2.5);
	    Candy candy2 = new Candy("Choco", 50, 2.5);
	    assertTrue(candy1.isSameAS(candy2));
	}
	@Test
	void testIsSameAsFalse() {
	    Candy candy1 = new Candy("Caramel", 50, 2);
	    Candy candy2 = new Candy("Caramel", 50, 4);
	    assertFalse(candy1.isSameAS(candy2));
	}

}
