package aufgabe2019;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
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
		
		messung.forEach(element ->
		{
			int Fehler = 0;
//			Object[] TagemitMessungen = element.getMessart()
			
			LocalDate datumMessung = element.getDatum();
			if(element.getSollWert() < element.getIstWert())
				{
					Fehler+=1;
				} 	
			
			Tagesmessungen.add(element);
			messung.contains(datumMessung);
			
			if(messung.contains(datumMessung))
			{
				System.out.println("gibt es schon");
			}
			System.out.println("------------------------------------\n| messArt| anzahlFehler|"+element.getDatum()+" |\n------------------------------------\n");
			System.out.println("   "+element.getMessArt()+"		"+Fehler);
		});
		
		
	
	}

}
