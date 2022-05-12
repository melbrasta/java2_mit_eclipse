package animalshelter;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class AnimalTest
{

	@Test
	void testAnimalintStringLocalDateintboolean()
	{
		Animal a = new Animal(1,"Frodo",LocalDate.of(2015,9,4),1, true);
		assertEquals(a.getType(), 1);
		assertEquals(a.getName(), "Frodo");
		assertEquals(a.getDob(),LocalDate.of(2015,9,4));
		assertEquals(a.getTemper(),1);
		assertEquals(a.isAdoptable(),true);
		
		a.setName("hans");
		assertEquals(a.getName(),"hans");
		
		
	}



}
