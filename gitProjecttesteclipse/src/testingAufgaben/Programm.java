package testingAufgaben;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import testing.ProduktController;

public class Programm
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		PersonenController pc = null;		//Controller f�r die Personen wird initialisiert
		EmployeeController ec = null;		//Controller f�r die Employees wird initialisiert
	
		
		
		
		Personen p1 = new Personen("Torben", "Tester");
		Personen p2 = new Personen("Hannes", "Hatsfalschgemacht");
		Personen p3 = new Personen("Vera", "Versuch");
		
		Employee e1 = new Employee("Anne", "Arbeitstier", 1);
		Employee e2 = new Employee ("Kurt", "K�ndigt", 0);
		Employee e3 = new Employee("Sarah", "Saubermann",2);
		
		
		
		try
		{
			pc = new PersonenController();	//Controller f�r die Personen wird instanziert
			pc.createTables();
			
			ec = new EmployeeController();	//Controller f�r die Employees wird instanziert
			ec.createTables();
		}
		catch( SQLException e)
		{
			System.err.println("Datenbank ist nicht funktionsf�hig.");
		}
		catch ( ClassNotFoundException e)
		{
			System.err.println("Fehler im Datenbank Treiber " +e.getMessage());
		}
		
		pc.addPersonentoDatabase(p1);
		pc.addPersonentoDatabase(p2);
		pc.addPersonentoDatabase(p3);
		
		JOptionPane.showMessageDialog(null, "Personen hinzugef�gt.");
		
		ec.addEmployeeToDatabase(e1);
		ec.addEmployeeToDatabase(e2);
		ec.addEmployeeToDatabase(e3);
		
		JOptionPane.showMessageDialog(null, "Employees hinzugef�gt.");

	}

}
