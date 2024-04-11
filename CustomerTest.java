package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerTest {
	Customer c = new Customer("Martin");
	@Test
	void testGetCustName() {
		String name = c.getCustName();
		assertEquals(name, "Martin");
	}

	@Test
	void testSetCustName() {
		c.setCustName("Jamse");
		String name = c.getCustName();
		assertEquals(name, "Jamse");
	}
	@Test
	void testGetCustID() {
		int name = c.getCustID();
		assertEquals(name, 1000);
	}
}
