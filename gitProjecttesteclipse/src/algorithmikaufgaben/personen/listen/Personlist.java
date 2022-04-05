package algorithmikaufgaben.personen.listen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import algorithmikaufgaben.personen.company.Personen;


public class Personlist
{

	public static void main(String[] args)
	{
		LinkedList<Personen> liste = new LinkedList<Personen>();
		
		//entweder jedes mal einen neuen Konstruktor ( new Personen)
		liste.add(new Personen("a" , "ab" , 55 ) );	
		liste.add(new Personen("b" , "bb" , 54 ));
		liste.add(new Personen("c" , "cb", 15 ));
		liste.add(new Personen("d" , "db" , 554));
		
//		//oder mit der Methode static Personen insert:
//		liste.add(insert("e" , "eb" , 96, 160));
//		liste.add(insert("f" , "fb" , 102, 190));
//		liste.add(insert("g" , "gb" , 4, 138));
//		liste.add(insert("h" , "hb" , 26, 176));

		System.out.println( "Aktuelle Anzahl Personen in der Liste: " +  liste.size() ) ;
		
		// zur Übersicht eine leere Zeile
		System.out.println("\n");
		
		printList(liste);
		
		System.out.println("\n");
		
		
		// Lambda Funktion um unter 18 und über 80 raus zu löschen
		liste.removeIf( value -> (value.getAge() < 18 || value.getAge() > 80) );
		
		System.out.println( "Aktuelle Anzahl Personen in der Liste nach dem löschen: " +  liste.size() ) ;
	
		
		//erste Möglichkeit um alle Werte aus der Liste anzuzeigen:
		
		liste.forEach( value -> {
			System.out.println("Current value: " + value);
		});
		
		
		//oder mit der Methode die Liste ausgeben lassen:
		System.out.println("\n");
		printList(liste);		//vor dem Sortieren
		
		
//		liste.sort( (a,b) -> a.getHeight() -b.getHeight()  ) ;
		
		// zur Übersicht eine leere Zeile
		System.out.println("\n");
		
		printList(liste);
		
//		for( int i = 0; i < liste.size(); i++ )
//		{
//			System.out.println( liste.get(i) );
//		}
	
	
	}

	// personen insert in liste methode
//	public static Personen insert (String firstname, String lastname, int age, int height)
//	{
//		Personen p = new Personen(firstname , lastname , age , height);
//		return p;
//	}
	
	
	
	// Ausgabe der aktuellen Liste
	public static void printList( List<?> lst ) 
	{
		
		for( int  i =0; i< lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}		
	}
	
	

	
	
	
}
