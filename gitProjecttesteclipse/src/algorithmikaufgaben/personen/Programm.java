package algorithmikaufgaben.personen;

import java.util.LinkedList;
import java.util.Scanner;


public class Programm 
{
	public static void showabteilung(LinkedList<Abteilung>listeabt)
	{
		
		listeabt.forEach(value -> {
		System.out.println(value.getName() );
		});
	}

	public static void main(String []args ) 
	{
		LinkedList<Mitarbeiter> listeMitar = new LinkedList<Mitarbeiter>();
		listeMitar.add(new Mitarbeiter("hans","peter",67,556897,"design"));
		
		LinkedList<Abteilung> listeabt = new LinkedList<Abteilung>();
		listeabt.add(new Abteilung("Marketing", "Hans M�ller",3));
		listeabt.add(new Abteilung("design", "Hans M�ller",4));
		listeabt.add(new Abteilung("telefon", "Hans M�ller",7));
		
		
		
		
		
		System.out.println(listeMitar.get(0));
		
		
		System.out.println( "Aktuelle Anzahl Abteilungen in der Liste: " +  listeabt.size() ) ;
//		printList(liste);
		
		/**
		 * hier ist die ausgabe der Liste = null :(
		 */
		
//		listeabt.forEach( value -> {
//			System.out.println("Current value: " + value);
//		});
		
		
		
		
	
	//
	//
	//
	//
		
		
		
		
		
		
		
		Scanner sc = new Scanner (System.in);	
		
		
		
		String anlegen =null;
		do
		{
			anlegen =null;

			
			System.out.println("[Mitarbeiter] oder [Kunde] anlegen?");
			anlegen = sc.nextLine();
			

			if (anlegen.equals("Mitarbeiter"))
			{
				LinkedList<Mitarbeiter> liste = new LinkedList<Mitarbeiter>();
			
				System.out.println("Bitte Mitarbeiter hinzuf�gen:[vorname]");
				
				String neueMitName = sc.nextLine();
				
				System.out.println("Bitte Mitarbeiter hinzuf�gen:[nachname]");
				String neueMitNachame = sc.nextLine();
				
				System.out.println("Bitte Mitarbeiter hinzuf�gen:[age]");
				String sage = sc.nextLine();
				int neueMitAge = Integer.valueOf(sage);
				
				
				
				System.out.println("Bitte Mitarbeiter hinzuf�gen:[mitarbeiternr]");
				String snr = sc.nextLine();
				int neueMitNr = Integer.valueOf(snr);
				showabteilung(listeabt);
				System.out.println("Bitte Mitarbeiter einer bestehenden Abteilung zuordnen oder eine neue Abteilung erstellen:[abteilung]");
				System.out.println("\n");
				

				
				String mitabteil = sc.nextLine();
					
				
				liste.add(new Mitarbeiter(neueMitName, neueMitNachame, neueMitAge, neueMitNr, mitabteil));
				
				/**
				 * if not exists einf�gen!!!
				 */
				listeabt.add(null)
			
				
				
//				sc.close();
				
				liste.forEach( value -> {
					System.out.println("Neuen Mitarbeiter angelegt: " + value);
				});
				
				
	/**
	 * 			
	 */
//				System.out.println(listeabt);
	/**
	 * 		
	 */
				
				
		
			}else if (anlegen.equals("Kunde"))
			{
				LinkedList<Kunde> liste = new LinkedList<Kunde>();
				
				System.out.println("Bitte Kunde hinzuf�gen:[vorname]");
				
				String neueMitName = sc.nextLine();
				
				System.out.println("Bitte Kunde hinzuf�gen:[nachname]");
				String neueMitNachame = sc.nextLine();
				
				System.out.println("Bitte Kunde hinzuf�gen:[age]");
				String sage = sc.nextLine();
				int neueMitAge = Integer.valueOf(sage);
				
				
				System.out.println("Bitte Kunde hinzuf�gen:[Kundenr]");
				String snr = sc.nextLine();
				int neueKunNr = Integer.valueOf(snr);
					
				
				liste.add(new Kunde(neueMitName, neueMitNachame, neueMitAge, neueKunNr));
			
//				sc.close();
				
				liste.forEach( value -> {
					System.out.println("Neuen Kunden angelegt: " + value);
				});
	//			printList(liste);
			}
			
		} 
		while (!anlegen.equals("quit"));
	}
	
}
