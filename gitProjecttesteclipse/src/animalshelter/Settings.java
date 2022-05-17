package animalshelter;

import animalshelter.PostgresDBConnector;

public class Settings {
	public static final int DB_SQLITE3 = 0x01;
	public static final int DB_MYSQL = 0x02;
	public static final int DB_POSTGRES = 0x04;
	
	
	private int database;
	
	private String databaseServer;
	private String databaseUser;
	private String databasePasswd;
	private String databaseDB;
	
	
	public Settings() {
		this.database = DB_SQLITE3;

	}

	
	

	public int getDatabase() {
		return database;
	}


	public void setDatabase(int database) {
		this.database = database;
	}


	public String getDatabaseServer() {
		return databaseServer;
	}


	public void setDatabaseServer(String databaseServer) {
		this.databaseServer = databaseServer;
	}


	public String getDatabaseUser() {
		return databaseUser;
	}


	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
	}


	public String getDatabasePasswd() {
		return databasePasswd;
	}


	public void setDatabasePasswd(String databasePasswd) {
		this.databasePasswd = databasePasswd;
	}


	public String getDatabaseDB() {
		return databaseDB;
	}


	public void setDatabaseDB(String databaseDB) {
		this.databaseDB = databaseDB;
	}




	public DBConnector getDatabaseConnector() {
		switch ( this.getDatabase() ) {
		case Settings.DB_SQLITE3:
			return new SQLiteConnector();
			
		case Settings.DB_MYSQL:
			return new MySQLConnector();
			
		case Settings.DB_POSTGRES:
			return new PostgresDBConnector();
				
		}
		
		return null;
	}
	
	

}
