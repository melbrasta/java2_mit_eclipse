package algorithmikaufgaben.personen;

import java.util.LinkedList;
import java.util.List;

public class Abteilung
{
	private String name;
	private Mitarbeiter abteilungsleiter;
	private LinkedList<Mitarbeiter> liste;
	
	
	
	public Abteilung(String name, String abteilungsleiter, String mitarbeiter)
		{
			// TODO Auto-generated constructor stub
		}



	public static void main(String[] args)
	{
		LinkedList<Abteilung> liste = new LinkedList<Abteilung>();
		
		
		liste.add(new Abteilung("Marketing", "Hans Müller", "viele Mitarbeiter"));
		liste.add(new Abteilung("Marketing", "Hans Müller", "viele Mitarbeiter"));
		liste.add(new Abteilung("Marketing", "Hans Müller", "viele Mitarbeiter"));
		
		
		System.out.println( "Aktuelle Anzahl Abteilungen in der Liste: " +  liste.size() ) ;
//		printList(liste);
		
		/**
		 * hier ist die ausgabe der Liste = null :(
		 */
		
		liste.forEach( value -> {
			System.out.println("Current value: " + value);
		});
		
		
		
		
		System.out.println(liste);
	//
	//
	//
	//
		
	}
	
	
	public static void printList( List<?> lst ) 
	{
		
		for( int  i =0; i< lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}		
	}
	
	
	
	
	



	
	
	

	public String getName()
	{
		return name;
	}



	public void setName(String name)
	{
		this.name = name;
	}



	public Mitarbeiter getAbteilungsleiter()
	{
		return abteilungsleiter;
	}



	public void setAbteilungsleiter(Mitarbeiter abteilungsleiter)
	{
		this.abteilungsleiter = abteilungsleiter;
	}



	public LinkedList<Mitarbeiter> getListe()
	{
		return liste;
	}



	public void setListe(LinkedList<Mitarbeiter> liste)
	{
		this.liste = liste;
	}



	private String getInfo()
	{
		
		return this.getName() + this.getAbteilungsleiter() + this.getListe();
	}
	
	
	public String toString() {
		return this.getInfo();
	}
	
	
}
