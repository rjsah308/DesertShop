package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandyTest2 {
	Candy c = new Candy("Choo",100,5);
	@Test
	void testGetPackaging() {
		assertEquals(c.getPackaging(), "Bag");
	}

	@Test
	void testSetPackaging() {
		c.setPackaging("Paper Bag");
		assertEquals(c.getPackaging(), "Paper Bag");
	}
}
