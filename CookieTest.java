package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {
	Cookie coo = new Cookie ("Choco",1,1);
	@Test
	void testGetCookieQty() {
		int cookieQty = coo.getCookieQty();
		assertEquals(cookieQty, 1);
	}

	@Test
	void testSetCookieQty() {
		coo.setCookieQty(5);
		int cookieQty = coo.getCookieQty();
		assertEquals(cookieQty, 5);
	}
	@Test
	void testGetPricePerDoze() {
		double pricePerDoze = coo.getPricePerDozen();
		assertEquals(pricePerDoze, 1);
	}

	@Test
	void testSetPricePerDoze() {
		coo.setPricePerDozen(5);
		double pricePerDoze = coo.getPricePerDozen();
		assertEquals(pricePerDoze, 5);
	}
	@Test
	void testGetPackaging() {
		assertEquals(coo.getPackaging(), "Box");
	}

	@Test
	void testSetPackaging() {
		coo.setPackaging("Paper Box");
		assertEquals(coo.getPackaging(), "Paper Box");
	}
	@Test
	void testIsSameAsTrue() {
	    Cookie cookie1 = new Cookie("Choco", 30, 2.5);
	    Cookie cookie2 = new Cookie("Choco", 50, 2.5);
	    assertTrue(cookie1.isSameAS(cookie2));
	}
	@Test
	void testIsSameAsFalse() {
	    Cookie cookie1 = new Cookie("Choco", 50, 3);
	    Cookie cookie2 = new Cookie("Choco", 50, 2);
	    assertFalse(cookie1.isSameAS(cookie2));
	}

}
