package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {
	IceCream i = new IceCream("vanila", 2, 1);
	@Test
	void testGetScoopCount() {
		int scoopCount = i.getScoopCount();
		assertEquals(scoopCount, 2);
	}

	@Test
	void testSetScoopCount() {
		i.setScoopCount(3);
		int scoopCount = i.getScoopCount();
		assertEquals(scoopCount, 3);
	}

	@Test
	void testGetPricePerScoop() {
		double pricePerScoop = i.getPricePerScoop();
		assertEquals(pricePerScoop, 1);
	}

	@Test
	void testSetPricePerScoop() {
		i.setPricePerScoop(2);
		double pricePerScoop = i.getPricePerScoop();
		assertEquals(pricePerScoop, 2);
	}

}
