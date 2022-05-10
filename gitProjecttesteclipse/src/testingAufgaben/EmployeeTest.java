package testingAufgaben;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest
{

	@Test
	void testEmployeeStringStringInt()
	{
		Employee e = new Employee("Anne", "Arbeitstier", 1);
		
		assertEquals(e.getNachname(),"Arbeitstier");
		assertEquals(e.getVorname(),e.getVorname());
	}

	@Test
	void testGetVorname()
	{
		Employee e = new Employee("Anne", "Arbeitstier", 1);
		
		assertEquals(e.getVorname(),"Anne");
	}

	@Test
	void testGetNachname()
	{
		Employee e = new Employee("Anne", "Arbeitstier", 1);
		
		assertEquals(e.getNachname(),"Arbeitstier");
	}

	@Test
	void testGetMitarbeiternummer()
	{
		Employee e = new Employee("Anne", "Arbeitstier", 1);
		
		assertEquals(e.getMitarbeiternummer(),1);
	}

}
