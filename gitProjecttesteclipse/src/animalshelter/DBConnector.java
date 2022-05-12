package animalshelter;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DBConnector {
	private Connection conn;
	
	public abstract void connect()throws SQLException, ClassNotFoundException;
	public abstract void createDatabase() throws SQLException;
	public abstract void dropDatabase() throws SQLException ;
	
	public Connection getConnection() {
		return null;
	}
	
	public AnimalShelter[] getAllShelters() {
		return null;
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
	
	public Animal[] listAllAnimalsInShelter(AnimalShelter shelter,  int shelterId ) {
		return null;
	}
	
	public void close() throws SQLException {
		this.conn.close();
	}
	
	

	
}
