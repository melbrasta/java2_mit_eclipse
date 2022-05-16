package animalshelter;

import java.sql.SQLException;

public class Program {
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		DBConnector db = new SQLiteConnector();
//		DBConnector db = new MySQLConnector();
//	DBConnector db = new PostgresDBConnector();
		
		db.connect();
//		db.dropDatabase();
//		db.createDatabase();
		System.out.println("Yaay JDBC");
		
		db.addAnimalToShelter(null, null);
		
		
	
	}

}
