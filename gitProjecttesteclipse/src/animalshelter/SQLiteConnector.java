package animalshelter;

import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteConnector extends DBConnector {

	@Override
	public void connect() throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		String connect = "jdbc:sqlite:animalshelter.db";
		this.connect(connect);
		
	}

	@Override
	public void createDatabase() throws SQLException {
		String[] queries = {
				"CREATE TABLE IF NOT EXISTS animal(animalId INTEGER PRIMARY KEY, typeId INTEGER, name TEXT, dob DATE, temperId INTEGER, adoptable INTEGER)",
				"CREATE TABLE IF NOT EXISTS animalshelter(shelterId INTEGER PRIMARY KEY, name TEXT)",
				"CREATE TABLE IF NOT EXISTS animaldetails(id INTEGER PRIMARY KEY, shelterId INTEGER, animalId INTEGER)",
				"CREATE TABLE IF NOT EXISTS type(typeId INTEGER PRIMARY KEY, typeName TEXT)",
				"CREATE TABLE IF NOT EXISTS temper(temperId INTEGER PRIMARY KEY, temperName TEXT)",
		};
		
		Statement stmt = this.getConnection().createStatement();
		for( String query : queries) {
			stmt.execute(query);
		}
		stmt.close();
		
	}

	@Override
	public void dropDatabase() throws SQLException {
		String[] queries = {
				"DROP TABLE IF EXISTS animal",
				"DROP TABLE IF EXISTS animalshelter",
				"DROP TABLE IF EXISTS animaldetails",
				"DROP TABLE IF EXISTS type",
				"DROP TABLE IF EXISTS temper"
		};
		
	}

}
