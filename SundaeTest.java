package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {
	Sundae s = new Sundae("vanila", 2, 1, "caramel", 1);
	@Test
	void testGetToppingName() {
		String toppingName = s.getToppingName();
		assertEquals(toppingName, "caramel");
	}

	@Test
	void testSetToppingName() {
		s.setToppingName("choco");
		String toppingName = s.getToppingName();
		assertEquals(toppingName, "choco");
	}

	@Test
	void testGetToppingPrice() {
		double toppingPrice = s.getToppingPrice();
		assertEquals(toppingPrice, 1);
	}

	@Test
	void testSetToppingPrice() {
		s.setToppingPrice(2);
		double toppingPrice = s.getToppingPrice();
		assertEquals(toppingPrice, 2);
		
	}

}
