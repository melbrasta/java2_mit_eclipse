package animalshelter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnimalShelterTest
{

	@Test
	void testAnimalShelter()
	{
		AnimalShelter anish = new AnimalShelter("froster");
		assertEquals(anish.getShelterName(null),"froster");
	}

	@Test
	void testAddAnimal()
	{
	//	AnimalShelter anish = new AnimalShelter("froster");
		
		
	}

	@Test
	void testSetAnimal()
	{
		fail("Not yet implemented");
	}

	@Test
	void testGetAnimal()
	{
		fail("Not yet implemented");
	}

	@Test
	void testDelAnimal()
	{
		fail("Not yet implemented");
	}

}
