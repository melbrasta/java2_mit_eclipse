package algorithmikaufgaben.personen;

import java.util.LinkedList;
import java.util.Scanner;

import algorithmikaufgaben.personen.company.Abteilung;
import algorithmikaufgaben.personen.company.Kunde;
import algorithmikaufgaben.personen.company.Mitarbeiter;


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
		
		LinkedList<Abteilung> listeAbt = new LinkedList<Abteilung>();
		listeAbt.add(new Abteilung(" Marketing ", " Hans Müller ",3));
		listeAbt.add(new Abteilung(" design ", " Hans Müller ",4));
		listeAbt.add(new Abteilung(" telefon ",  " Hans Müller ",7));
		
		LinkedList<Kunde> listeKun = new LinkedList<Kunde>();
		listeKun.add(new Kunde(" kauf "," mann ",67,556897));
		
		
/**
 * 	hier werden listen getestet
 */
//		System.out.println(listeMitar.get(0));
//		System.out.println(listeAbt.get(1));
//		listeAbt.remove(1);
//		System.out.println(listeAbt.get(1));
//				
//		System.out.println( "Aktuelle Anzahl Abteilungen in der Liste: " +  listeAbt.size() ) ;
	//		printList(liste);
		
		
		//
		//
		//
		//
/**
 * TODO	
 */

		System.out.println(listeAbt.get(0));
		if (listeAbt.get(0).contains(" Marketing ")) 
		{
			System.out.println(listeAbt.get(0));
		}
		
		
//		showabteilung(listeAbt);
			
		Scanner sc = new Scanner (System.in);	
		
		
		
		String anlegen =null;
		String mode =null;
		String entfernen=null;
		do
		{
			anlegen =null;
			mode =null;
			entfernen=null;
	
			
			
			System.out.println("Mode:\n[1] = Create  \n[2] = Delete ");
			mode = sc.nextLine();
			if (mode.equals("1"))		//create
			{
					
				
				/**
				 *  TODO hier fehlt noch case 3 = Abteilung erstellen
				 */
				System.out.println("\nAnlegen:\n[1] = Mitarbeiter,[2] = Kunde oder [3] = Abteilung\n");
				anlegen = sc.nextLine();
				
	
				if (anlegen.equals("Mitarbeiter" )||anlegen.equals("1"))
				{
	//				LinkedList<Mitarbeiter> listeMitar = new LinkedList<Mitarbeiter>();
				
					System.out.println("Bitte Mitarbeiter hinzufügen:[vorname]");
					
					String neueMitName = sc.nextLine();
					
					System.out.println("Bitte Mitarbeiter hinzufügen:[nachname]");
					String neueMitNachame = sc.nextLine();
					
					System.out.println("Bitte Mitarbeiter hinzufügen:[age]");
					String sage = sc.nextLine();
					int neueMitAge = Integer.valueOf(sage);
					
					
					
					System.out.println("Bitte Mitarbeiter hinzufügen:[mitarbeiternr]");
					String snr = sc.nextLine();
					int neueMitNr = Integer.valueOf(snr);
					showabteilung(listeAbt);
					System.out.println("Bitte Mitarbeiter einer bestehenden Abteilung zuordnen oder eine neue Abteilung erstellen:[abteilung]");
					System.out.println("\n");
					
	
					
					String mitabteil = sc.nextLine();
					
					/**
					 * TODO if listenname not exists einfügen!!!
					 * 
					 */
					
					System.out.println(listeAbt);
					listeAbt.add(new Abteilung(mitabteil,  neueMitName + " "+ neueMitNachame,7));

					listeMitar.add(new Mitarbeiter(neueMitName, neueMitNachame, neueMitAge, neueMitNr, mitabteil));
					
					showabteilung(listeAbt);
					

				
					
					
	//				sc.close();
					
					listeMitar.forEach( value -> {
						System.out.println("Neuen Mitarbeiter angelegt: " + value);
					});
					
					
		/**
		 * 			
		 */
	//				System.out.println(listeabt);
		/**
		 * 		
		 */
					
					
			
				}else if (anlegen.equals("Kunde" )||anlegen.equals("2"))
				{
	/** nach oben gewandert	
	 *  			LinkedList<Kunde> listeKun = new LinkedList<Kunde>();
	 */
					
					System.out.println("Bitte Kunde hinzufügen:[vorname]");
					
					String neueMitName = sc.nextLine();
					
					System.out.println("Bitte Kunde hinzufügen:[nachname]");
					String neueMitNachame = sc.nextLine();
					
					System.out.println("Bitte Kunde hinzufügen:[age]");
					String sage = sc.nextLine();
					int neueMitAge = Integer.valueOf(sage);
					
					
					System.out.println("Bitte Kunde hinzufügen:[Kundenr]");
					String snr = sc.nextLine();
					int neueKunNr = Integer.valueOf(snr);
						
					
					listeKun.add(new Kunde(neueMitName, neueMitNachame, neueMitAge, neueKunNr));
					System.out.println("\nNeue Kundenliste:\n");
					listeKun.forEach( value -> {
						System.out.println(value);
					});

				} 
				else if (anlegen.equals("Abteilung" )||anlegen.equals("3"))
				{
	/**
	 * TODO	Anlegen: abteilung			
	 */
					System.out.println(listeAbt);
					showabteilung(listeAbt);
				}
			}	//if mode ende
			else if (mode.equals("2"))	//delete
			{
				System.out.println("drop database also :D");
				System.out.println("\nEntfernen:\n[1] = Mitarbeiter,[2] = Kunde oder [3] = Abteilung\n");
				entfernen = sc.nextLine();
				
	
				if (entfernen.equals("Mitarbeiter" )||entfernen.equals("1"))
				{
	//				LinkedList<Mitarbeiter> liste = new LinkedList<Mitarbeiter>();
				
					

					System.out.println("Bitte Eintrag Nummer [ ] entfernen:");
					System.out.println("\n");
					
					listeMitar.forEach( value -> {
					System.out.println("Aktuelle Mitarbeiterliste: " + value);
					});
					String  remNr= sc.nextLine();
					int remEntry = Integer.valueOf(remNr);
					
					listeMitar.remove(remEntry);
					
					
	//				sc.close();
					
//					liste.forEach( value -> {
//						System.out.println("Neuen Mitarbeiter angelegt: " + value);
//					});
//					
					
		/**
		 * 			
		 */
	//				System.out.println(listeabt);
		/**
		 * 		
		 */
					
					
			
				}else if (entfernen.equals("Kunde" )||entfernen.equals("2"))
				{
					
					System.out.println("Bitte Kunde entfernen: ");
					
					System.out.println("\nAktuelle Kundenliste\n");
					listeKun.forEach( value -> {
						System.out.println(value);
					});

					String  remKu= sc.nextLine();
					int remKunde = Integer.valueOf(remKu);
					
					listeKun.remove(remKunde);	
					
					System.out.println("\nNeue Kundenliste\n");
					listeKun.forEach( value -> {
					System.out.println(value);
					
					});

				}else if (entfernen.equals("Abteilung" )||entfernen.equals("3"))
				{
					System.out.println("Bitte Eintrag Nummer [ ] entfernen:");
					System.out.println("\n");
					
					listeAbt.forEach( value -> {
					System.out.println("Aktuelle Abteilungen: " + value);
					});
					String  remNr= sc.nextLine();
					int remEntry = Integer.valueOf(remNr);
					
					listeAbt.remove(remEntry);
					
					
	//				sc.close();
				}
			}
			
		}while (!mode.equals("quit"));
				
		
	}
	
		
}
