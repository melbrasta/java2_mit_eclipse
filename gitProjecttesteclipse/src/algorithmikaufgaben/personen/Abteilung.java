package algorithmikaufgaben.personen;

import java.util.LinkedList;
import java.util.List;

public class Abteilung
{
	private String name;
	private String abteilungsleiter;
	private LinkedList<Mitarbeiter> liste;
	
	
	
	public Abteilung(String name, String abteilungsleiter, String mitarbeiter)
		{
			// TODO Auto-generated constructor stub
		}



	public static void main(String[] args)
	{
		LinkedList<Abteilung> liste = new LinkedList<Abteilung>();
		
		
		liste.add(new Abteilung("Marketing", "Hans Müller", "viele Mitarbeiter"));
		
		
		System.out.println( "Aktuelle Anzahl Abteilungen in der Liste: " +  liste.size() ) ;
		printList(liste);
		
		liste.forEach( value -> {
			System.out.println("Current value: " + value);
		});
		
		
	}
	
	
	public static void printList( List<?> lst ) 
	{
		
		for( int  i =0; i< lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}		
	}
	
	public String toString() {
		return this.getInfo();
	}



	private String getInfo()
	{
		
		return this.name;
	}
	
	
}
