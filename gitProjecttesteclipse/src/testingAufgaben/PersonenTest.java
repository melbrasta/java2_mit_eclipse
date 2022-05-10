package testingAufgaben;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonenTest
{


	@Test
	void testGetVorname()
	{
		Personen p = new Personen("Willy", "Willnicht");
		
		assertEquals(p.getVorname(),"Willy");
	}

	@Test
	void testGetNachname()
	{
		Personen p = new Personen("Willy", "Willnicht");
		
		assertEquals(p.getNachname(),"Willnicht");
	}

	@Test
	void testPersonenStringString()
	{
		Personen p = new Personen("Willy", "Willnicht");
		
		assertEquals(p.getNachname(),"Willnicht");
		assertEquals(p.getVorname(),p.getVorname());
	}
}
