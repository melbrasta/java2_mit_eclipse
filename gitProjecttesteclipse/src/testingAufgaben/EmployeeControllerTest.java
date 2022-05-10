package testingAufgaben;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class EmployeeControllerTest
{

	@Test
	void testEmployeeController() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.sqlite.JDBC");
		
		String dbFileName = "jdbc:sqlite:Personendb.db";
		
		DriverManager.getConnection(dbFileName);
	}



	@Test
	void testCreateTables() throws SQLException, ClassNotFoundException
	{
		EmployeeController ec = new EmployeeController();
		ec.dropDB();
		ec.createTables();
		
		ec.close();
	}
	
//	@Test
//	void testgetEmployeeFromDatabase(

	@Test
	void testAddEmployeeToDatabase() throws ClassNotFoundException, SQLException
	{
		EmployeeController ec = new EmployeeController();
		ec.dropDB();
		ec.createTables();
		
		Employee e1 = new Employee("Emil","Edel",1);
		
		ec.addEmployeeToDatabase(e1);
		
		
		Employee e2 = ec.getEmployeeFromDatabase(1);
		
		
		assertEquals(e1.getVorname(),e2.getVorname());
		assertEquals(e1.getMitarbeiternummer(),e2.getMitarbeiternummer());
		
		ec.close();
		
		
	}

}
