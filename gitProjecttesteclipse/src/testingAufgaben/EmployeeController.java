package testingAufgaben;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeController
{
	private Connection conn;
	
	
	public EmployeeController() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.sqlite.JDBC");
		
String dbFileName = "jdbc:sqlite:Personendb.db";
		
		this.conn = DriverManager.getConnection(dbFileName);
	}
	
	public void dropDB() throws SQLException
	{
		String query = "DROP TABLE IF EXISTS Employees";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();
		
	}
	
	public void createTables() throws SQLException
	{
		dropDB();
		String query = "CREATE TABLE IF NOT EXISTS Employees (Vorname TEXT, Nachname TEXT, Mitarbeiternummer INT)";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();
	}
	
	public boolean addEmployeeToDatabase (Employee employee) throws SQLException
	{
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO Employees(Vorname, Nachname, Mitarbeiternummer) VALUES(?,?,?)");
		
		pstmt.setString(1, employee.getVorname());
		pstmt.setString(2, employee.getNachname());
		pstmt.setInt(3, employee.getMitarbeiternummer());
		
		return pstmt.execute();
		
	}

	public void close() throws SQLException
	{
		this.conn.close();
		
	}
	
	public Employee getEmployeeFromDatabase(int Mitarbeiternummer) throws SQLException
	{
		Employee e = null;
		PreparedStatement pstmt = this.conn.prepareStatement("SELECT * FROM Employees WHERE Mitarbeiternummer=?");
		pstmt.setInt(1, Mitarbeiternummer);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			e = new Employee(
					rs.getString("Vorname"),
					rs.getString("Nachname"),
					rs.getInt("Mitarbeiternummer")
					);	
		}
		
		
		return e;
	}
	
}
