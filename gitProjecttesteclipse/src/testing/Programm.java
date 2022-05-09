package testing;

import java.sql.SQLException;

public class Programm {

	public static void main(String[] args) {
		try {
			ProduktController pc = new ProduktController();
			pc.setupDatabase();
		}
		catch( SQLException e ) {
			System.err.println("Fehler in der Datenbank: " + e.getMessage());
		}
		catch( ClassNotFoundException e) {
			System.err.println("Fehler im Datenbank-Treiber");
		}

	}

}
