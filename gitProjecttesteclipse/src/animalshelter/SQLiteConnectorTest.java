package animalshelter;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class SQLiteConnectorTest {



	@Test
	void testGetAllShelters() throws ClassNotFoundException, SQLException {
		DBConnector db = new SQLiteConnector();
		db.connect();
		AnimalShelter[] shelters = db.getAllShelters();
		
		assertEquals(shelters.length, 2);
		assertEquals(shelters[0].getName(), "Zur glotzenden Giraffe");
		assertEquals(shelters[1].getName(), "Der kotzende Biber");
		
		db.close();
		
	}
	
	 @Test
	 void testAllAnimalsFromDatabase() throws ClassNotFoundException, SQLException {
			DBConnector db = new SQLiteConnector();
			db.connect();
			AnimalShelter[] shelters = db.getAllShelters();
			
			Animal[] animals  = db.listAllAnimalsInShelter(shelters[0]);
			
			
			assertNotNull(animals);
			assertNotEquals(animals.length, 0);
			
	
			db.close();
	 
		 
	 }

	@Test
	void testGetTypeFromId( )  throws ClassNotFoundException, SQLException {
		DBConnector db = new SQLiteConnector();
		db.connect();
		
	
		assertEquals(db.getTypeFromId(7), "Habicht");
		assertEquals(db.getTypeFromId(11), "Heimchen");
		assertEquals(db.getTypeFromId(18), "Sumpfrohrsänger");
	
		db.close();
	}
	
}
