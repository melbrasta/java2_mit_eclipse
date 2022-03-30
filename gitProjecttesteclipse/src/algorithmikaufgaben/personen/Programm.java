package algorithmikaufgaben.personen;

import java.util.LinkedList;
import java.util.Scanner;


public class Programm 
{

	public static void main(String []args ) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("[Mitarbeiter] oder [Kunde] anlegen?");
		String anlegen = sc.nextLine();
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
			
			System.out.println("Bitte Mitarbeiter einer bestehenden Abteilung zuordnen oder eine neue Abteilung erstellen:[abteilung]");
			System.out.println("\n");
			String mitabteil = sc.nextLine();
				
			
			liste.add(new Mitarbeiter(neueMitName, neueMitNachame, neueMitAge, neueMitNr, mitabteil));
		
			sc.close();
			
			liste.forEach( value -> {
				System.out.println("Neuen Mitarbeiter angelegt: " + value);
			});
	
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
		
			sc.close();
			
			liste.forEach( value -> {
				System.out.println("Neuen Kunden angelegt: " + value);
			});
//			printList(liste);
		}
	}
	
}
