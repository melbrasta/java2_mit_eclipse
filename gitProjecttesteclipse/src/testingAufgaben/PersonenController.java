package testingAufgaben;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonenController
{
	private Connection conn;
	
	public PersonenController() throws ClassNotFoundException, SQLException
	{
		Class.forName("org.sqlite.JDBC");
		
		String dbFileName = "jdbc:sqlite:Personendb.db";
		
		this.conn = DriverManager.getConnection(dbFileName);
	}
	
	public void dropDB() throws SQLException
	{
		String query = "DROP TABLE IF EXISTS Personen";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();
		
	}
	
	public void createTables() throws SQLException
	{
		dropDB();
		String query = "CREATE TABLE IF NOT EXISTS Personen (Vorname TEXT, Nachname TEXT)";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();
	}
	
	public boolean addPersonentoDatabase (Personen person) throws SQLException
	{
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO Personen(Vorname, Nachname) VALUES(?,?)");
		
		pstmt.setString(1, person.getVorname());
		pstmt.setString(2, person.getNachname());
		
		return pstmt.execute();
		
	}
	
}
