package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class ProduktController {
	private Connection conn;
	
	public ProduktController() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.sqlite.JDBC");
		
		String databaseFilename = "jdbc:sqlite:produktdatabase.db";
		
		this.conn = DriverManager.getConnection(databaseFilename);
			
	}
	
	public void dropDatabase() throws SQLException {
		String query = "DROP TABLE IF EXISTS Produkt";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();	
		
	}
	
	public void setupDatabase() throws SQLException {
		
		dropDatabase();
		String query = "CREATE TABLE IF NOT EXISTS Produkt( id INTEGER PRIMARY KEY,  produktName TEXT, produktKategorie INTEGER, produktPreis INTEGER )";
		Statement stmt = this.conn.createStatement();
		
		stmt.execute(query);
		stmt.close();
	
	}
	
	public boolean addProductToDatabase( Produkt produkt ) throws SQLException {
		PreparedStatement pstmt = this.conn.prepareStatement("INSERT INTO Produkt(produktName, produktKategorie, produktPreis) VALUES(?,?,?)");
		pstmt.setString(1, produkt.getProduktName());
		pstmt.setInt(2, produkt.getProduktKategorie());
		pstmt.setInt(3, produkt.getProduktPreis());
		
		return pstmt.execute();
	}
	
	
	public Produkt getProductFromDatabase( int produktId ) throws SQLException {
		
		Produkt p = null;
		PreparedStatement pstmt = this.conn.prepareStatement("SELECT * FROM Produkt WHERE id=?");
		
		pstmt.setInt(1, produktId);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			p = new Produkt(rs.getInt("id"), 
					rs.getString("produktName"),
					rs.getInt("produktKategorie"),
					rs.getInt("produktPreis") );	
		}
		
		
		return p;
	}
	
	public boolean changeProdukt( Produkt produkt ) throws SQLException {
		
		PreparedStatement pstmt = this.conn.prepareStatement("UPDATE Produkt SET produktName=?,produktKategorie=?, produktPreis=? WHERE id=?");

		pstmt.setString(1, produkt.getProduktName());
		pstmt.setInt(2, produkt.getProduktKategorie());
		pstmt.setInt(3, produkt.getProduktPreis());
		
		pstmt.setInt(4, produkt.getProduktId());
	
		
		return pstmt.executeUpdate() != 0;
	}
	
	public Produkt[] getAllProduktFromCategory(  int categoryId ) throws SQLException {
		LinkedList<Produkt> produkte = new LinkedList<>();
		
		PreparedStatement pstmt = this.conn.prepareStatement("SELECT * FROM Produkt WHERE produktKategorie=?");
		pstmt.setInt(1, categoryId);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Produkt p = new Produkt(rs.getInt("id"), 
							rs.getString("produktName"),
							rs.getInt("produktKategorie"),	
							rs.getInt("produktPreis") );
			produkte.add(p);
		}
		
		return produkte.toArray(new Produkt[0]);
	}

	
	
	public void close() throws SQLException {
		this.conn.close();
		
	}
	
	
	
	

}
