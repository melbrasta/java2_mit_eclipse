package algorithmikaufgaben.personen.listen;

import java.util.LinkedList;
import java.util.List;
import algorithmikaufgaben.personen.Personen;

public class Personlist
{

	public static void main(String[] args)
	{
		LinkedList<Personen> liste = new LinkedList<Personen>();
		
		liste.add(new Personen("a" , "ab" , 55 , 230) );
		liste.add(new Personen("b" , "bb" , 54 , 110));
		liste.add(new Personen("c", "cb", 15 , 50));
		liste.add(new Personen("d" , "db" , 4, 60));

		System.out.println( "Aktuelle Anzahl Personen in der Liste: " +  liste.size() ) ;
	}

	
	public static void printList( List<?> lst ) 
	{
		
		for( int  i =0; i< lst.size(); i++)
		{
			System.out.println(lst.get(i));
		}		
	}
	
}
