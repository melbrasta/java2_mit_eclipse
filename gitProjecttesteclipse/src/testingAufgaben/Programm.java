package testingAufgaben;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import testing.ProduktController;

public class Programm
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		PersonenController pc = null;		//Controller für die Personen wird initialisiert
		EmployeeController ec = null;		//Controller für die Employees wird initialisiert
	
		
		
		
		Personen p1 = new Personen("Torben", "Tester");
		Personen p2 = new Personen("Hannes", "Hatsfalschgemacht");
		Personen p3 = new Personen("Vera", "Versuch");
		
		Employee e1 = new Employee("Anne", "Arbeitstier", 1);
		Employee e2 = new Employee ("Kurt", "Kündigt", 0);
		Employee e3 = new Employee("Sarah", "Saubermann",2);
		
		
		
		try
		{
			pc = new PersonenController();	//Controller für die Personen wird instanziert
			pc.createTables();
			
			ec = new EmployeeController();	//Controller für die Employees wird instanziert
			ec.createTables();
		}
		catch( SQLException e)
		{
			System.err.println("Datenbank ist nicht funktionsfähig.");
		}
		catch ( ClassNotFoundException e)
		{
			System.err.println("Fehler im Datenbank Treiber " +e.getMessage());
		}
		
		pc.addPersonentoDatabase(p1);
		pc.addPersonentoDatabase(p2);
		pc.addPersonentoDatabase(p3);
		
		JOptionPane.showMessageDialog(null, "Personen hinzugefügt.");
		
		ec.addEmployeeToDatabase(e1);
		ec.addEmployeeToDatabase(e2);
		ec.addEmployeeToDatabase(e3);
		
		JOptionPane.showMessageDialog(null, "Employees hinzugefügt.");

	}

}
