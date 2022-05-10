package aufgabe2019;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Programm {
	

	public static void main(String[] args) {
		LinkedList<Messung> messung = new LinkedList<>();
		List<Messung> Tagesmessungen = new ArrayList<Messung>();
		
		
		messung.add(new Messung("2019-04-01", "06:00:00", 1,76, 80) );
		messung.add(new Messung("2019-04-01", "06:00:15", 2,197, 200) );
		messung.add(new Messung("2019-04-01", "06:00:15", 0,3.2, 3.41) );
		
		messung.add(new Messung("2019-04-02", "00:00:00", 0, 76.5, 78) );
		messung.add(new Messung("2019-04-02", "00:00:00", 0, 220, 200) );
		
		messung.add(new Messung("2019-04-03", "00:00:00", 2, 3.6, 3.4) );
		
	
		
		
		//
		// Aufgabe Erstelle für einzelne Tage eine Auswertung der Messfehler.
		// Gebe die Messfehler wie folgt aus:
		// ----------------------------------------------
		// | messArt| anzahlFehler            2019-04-01|
		// ----------------------------------------------
		// |	0	|  1                                |
		// |	1	|  0                                |
		// |	2	|  7                                |
		// ----------------------------------------------

	
//		System.out.println(messung);		//anscheinend unnötig gewesen. mit forEach auch ohne String ToString überschreiben möglich
		
//		Object[] array= messung.toArray();
//		  String[] array1 = Arrays.copyOf(array,array.length,String[].class);
//		  
//		  System.out.println(Arrays.toString(array1));
//		  
//		
//		String[] stringArray = messung.toArray(new String[0]);
//	    System.out.println("Contents of the array: \n"+Arrays.toString(stringArray));
	//	System.out.println(array);
//		System.out.println(messung.get(1));
//		System.out.println(messung.get(1).getDatum());
//		System.out.println(messung.get(0).getDatum());
		
		
		for (int i =(messung.size()-1); i>0 ; i--)
		{
			int Fehler = 0;
			if(messung.get(i).getDatum().equals(messung.get(i-1).getDatum()))	//check Datum
			{
				if(messung.get(i).getSollWert() < messung.get(i).getIstWert())	//Wenn Datum gleich, check Fehler
				{
					Fehler+=1;
					System.out.println("------------------------------------\n| messArt| anzahlFehler|"+messung.get(i).getDatum()+" |\n------------------------------------\n");
					System.out.println("   "+messung.get(i).getMessArt()+"		"+Fehler);		//Fehler +1 und Ausgabe	
					Fehler = 0;
				}																//wenn Datum gleich aber KEIN Fehler, ausgabe
				System.out.println("   "+messung.get(i).getMessArt()+"		"+Fehler);	
						
			}else																//wenn Datum ungleich...
			{
				if(messung.get(i).getSollWert() < messung.get(i).getIstWert())	//... check Fehler
				{
					Fehler+=1;
					System.out.println("------------------------------------\n| messArt| anzahlFehler|"+messung.get(i).getDatum()+" |\n------------------------------------\n");
					System.out.println("   "+messung.get(i).getMessArt()+"		"+Fehler);		
				}else{															// wenn Datum ungleich und KEIN Fehler
					System.out.println("------------------------------------\n| messArt| anzahlFehler|"+messung.get(i).getDatum()+" |\n------------------------------------\n");
					System.out.println("   "+messung.get(i).getMessArt()+"		"+Fehler);		//...Ausgabe
				}
			}

		}
		
//		messung.forEach(element ->
//		{
//			Object[] array= ((List<Messung>) element).toArray();
//			System.out.println(array);
			
			
//			int Fehler = 0;
////			Object[] TagemitMessungen = element.getMessart()
//			
//			LocalDate datumMessung = element.getDatum();
//			
//			element.getDatum().compareTo(datumMessung);
//			
//			
//			
//			if(element.getSollWert() < element.getIstWert())
//				{
//					Fehler+=1;
//				} 	
//			
//			Tagesmessungen.add(element);
//			messung.contains(datumMessung);
			
//			if(messung.contains(datumMessung))
//			{
//				System.out.println("gibt es schon");
//			}
//			System.out.println("------------------------------------\n| messArt| anzahlFehler|"+element.getDatum()+" |\n------------------------------------\n");
//			System.out.println("   "+element.getMessArt()+"		"+Fehler);
//		});
		
		
	
	}

}
