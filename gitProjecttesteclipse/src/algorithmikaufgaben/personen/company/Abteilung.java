package algorithmikaufgaben.personen.company;

import java.util.LinkedList;
import java.util.List;

public class Abteilung
{
	private String name;
	private String abteilungsleiter;
	private LinkedList<Mitarbeiter> liste;
	private int anzahlMitarbeiter;
	
	
	
	public Abteilung(String name, String abteilungsleiter, int anzahlMitarbeiter)
		{
			super();
			this.name = name;
			this.abteilungsleiter = abteilungsleiter;
			this.anzahlMitarbeiter = anzahlMitarbeiter;
			
			
		}





	public static void main(String[] args)
	{
		
		
		


		
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



	public String getAbteilungsleiter()
	{
		return abteilungsleiter;
	}



	public void setAbteilungsleiter(String abteilungsleiter)
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



	public String toString()
	{
		
		return this.getName();
	}
	
	
	public String getInfo() {
		return this.name + this.abteilungsleiter + " " + this.anzahlMitarbeiter;
	}





	public boolean contains(String string) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
