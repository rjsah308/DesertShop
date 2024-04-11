package DessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DessertItemTest2 {

	@Test
	void testCompareTo() {
		Candy c1 = new Candy("c1", 1.5, .25);
		Candy c2 = new Candy("c2", 2, .28);
		assertEquals(c1.compareTo(c2), -1);
	}
	

}
