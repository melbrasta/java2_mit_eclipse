package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProduktTest {

	@Test
	void testProduktStringIntInt() {
		Produkt p = new Produkt("Test", 1,100);
		assertEquals(p.getProduktName(), "Test");
		assertEquals(p.getProduktId(), 0);
		assertEquals(p.getProduktKategorie(), 1);
		assertEquals(p.getProduktPreis(), 100);
	}

	@Test
	void testProduktIntStringIntInt() {
		Produkt p = new Produkt(5,"Test", 1,100);
		assertEquals(p.getProduktName(), "Test");
		assertEquals(p.getProduktId(), 5);
		assertEquals(p.getProduktKategorie(), 1);
		assertEquals(p.getProduktPreis(), 100);
	}


}
