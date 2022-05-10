package testingAufgaben;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

class PersonenControllerTest
{

	@Test
	void testPersonenController() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.sqlite.JDBC");
		
		String dbFileName = "jdbc:sqlite:Personendb.db";
		
		DriverManager.getConnection(dbFileName);
		
		
	}

	@Test
	void testDropDB() throws ClassNotFoundException, SQLException
	{
		PersonenController pc = new PersonenController();
		pc.dropDB();
//		assert
		
		pc.close();
		
		
		

	}

	@Test
	void testCreateTables() throws ClassNotFoundException, SQLException
	{
		PersonenController pc = new PersonenController();
		pc.dropDB();
		pc.createTables();
		
		pc.close();
	}

	@Test
	void testgetPersonenFromDatabase() throws ClassNotFoundException, SQLException
	{
		Personen p = new Personen("Hans","Hatsgut");
		PersonenController pc = new PersonenController();
		
		pc.dropDB();
		pc.createTables();
		
		pc.addPersonentoDatabase(p);
		
		assertNotNull(p);
		assertEquals(p.getVorname(),"Hans");
		assertEquals(p.getNachname(),"Hatsgut");
		
		pc.close();
	}
	
	
	
	@Test
	void testAddPersonentoDatabase() throws ClassNotFoundException, SQLException
	{
		Personen p = new Personen("Hans","Hatsgut");
		PersonenController pc = new PersonenController();
		
		pc.dropDB();
		pc.createTables();
		
		pc.addPersonentoDatabase(p);
		
		Personen p2 = pc.getPersonenFromDatabase("Hans");
		assertEquals(p.getVorname(),p2.getVorname());
		
		pc.close();
		
		
		
	}

}
