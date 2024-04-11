package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest {
	DessertItem a = new Candy("Choo",100,5);
	@Test
	void testGetName() {
		String name = a.getName();
		assertEquals(name,"Choo");
	}

	@Test
	void testSetName() {
		a.setName("cake");
		String name = a.getName();
		assertEquals(name, "cake");
	}

}
