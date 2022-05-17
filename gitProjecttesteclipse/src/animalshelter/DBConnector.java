package animalshelter;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class DBConnector {
	private Connection conn;
	
	public abstract void connect()throws SQLException, ClassNotFoundException;
	public abstract void createDatabase() throws SQLException;
	public abstract void dropDatabase() throws SQLException ;
	
	
	public void connect(String connection) throws SQLException {
		this.conn = DriverManager.getConnection(connection);
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public static AnimalShelter[] getAllShelters() throws SQLException {
		LinkedList<AnimalShelter> animalShelters = new LinkedList<>();		//LinkedList
		
		String query="SELECT * FROM animalshelter";
		
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while( rs.next() ) {
			AnimalShelter animalShelter = new AnimalShelter(rs.getString("name"));
			animalShelters.add(animalShelter);
		}
		
		rs.close();
		stmt.close();
		
		
		return animalShelters.toArray(new AnimalShelter[0]);
	}
	
	public void addShelter( AnimalShelter shelter ) {
		
	}
	
	public AnimalShelter getShelter( AnimalShelter shelter ) {
		return null;
	}	
	
	public void addAnimalToShelter(AnimalShelter shelter,  Animal animal ) {
		
	
		
		


	}
	
	public void changeAnimalInShelter(AnimalShelter shelter,  Animal animal ) {
	}
	
	public Animal getAnimalFromShelter( int shelterId ,  int id ) {
		return null;
	}
	
	public Animal removeAnimalFromShelter( AnimalShelter shelter, int id ) {
		return null;
	}
	
	public Animal[] listAllAnimalsInShelter(AnimalShelter shelter ) throws SQLException {
		LinkedList<Animal> animals = new LinkedList<>();
		String query = "SELECT animal.* FROM animal, animalDetails, animalShelter WHERE animalShelter.name = ? AND animalDetails.shelterId = animalShelter.shelterId AND animal.animalId = animalDetails.animalId ";
		
		PreparedStatement pstmt = this.conn.prepareStatement(query);
		pstmt.setString(1, shelter.getShelterName());
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			Animal animal = new Animal(rs.getInt("typeId") ,
					rs.getString("name"),
					LocalDate.parse( rs.getString("dob").split(" ")[0]),
					rs.getInt("temperId"),
					rs.getBoolean("adoptable"));
					
			animals.add(animal);
			
		}
		
		rs.close();
		pstmt.close();
		
				
		return animals.toArray(new Animal[0]);
	}
	
	public void close() throws SQLException {
		if(this.conn !=null)
		{
			this.conn.close();
		}
	}
	
	
	public String getTypeFromId( int typeId ) throws SQLException {
		String typeName = null;
		
		String query= "SELECT typeName from Type where typeId = ? LIMIT 1";
		PreparedStatement pstmt = this.conn.prepareStatement(query);
		
		pstmt.setInt(1, typeId);
		
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			typeName = rs.getString("typeName");
		}
		
		return typeName;
	}
	
	

	
}
