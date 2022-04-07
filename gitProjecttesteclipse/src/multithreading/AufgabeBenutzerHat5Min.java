package multithreading;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;





public class AufgabeBenutzerHat5Min
{
	static String input=null;


	public static void main(String[] args) 
	{
		
/**
 * 
 * @author yannickb
 * hier startet die Usereingabe Methode: "Userinput"
 */
		class Userinput extends Thread
		{
		/**
		 * überschreiben der Run Methode von Thread
		 */
			@Override 
			public void run() 
			{
				Scanner sc = new Scanner(System.in);
				
			/**
			 * hier startet der Timer, der das Programm bei Ablauf beendet.
			 */
				Timer t1 = new Timer( );			
				t1.schedule(new TimerTask() 
				{

					private int counter= 5;
					
					@Override
					public void run() {
						System.out.println("Du hast noch "+  counter + " Sekunden für deine Eingabe." );
		 				if( this.counter <= 0) 
		 				{
		 					System.out.println("\nSo wird das nichts du lahme Schnecke.");
							System.exit(0);
						}
						counter--;			
					}
				// start, intervall
				}, 150, 1000);		//Der Timer hat einen Delay von 150ms, damit die Benutzereingabe auf jeden Fall vorher ausgegeben wird
				
		/**
		 * Timer ende
		 */
				
				/**
				 * 
				 */
					System.out.println("Bitte gib deine geheimsten Daten und Bankverbindungen ein:\n");
					input = sc.nextLine();	
					if(!input.equals(null))
					{
						/**
						 * wenn eine Eingabe vorliegt, dann soll als erstes der Timer beendet werden...
						 */
						t1.cancel();
						System.out.println("Danke. Ihr Konto wird gerade leer geräumt...\nBitte warten..");
						
						/**
						 * neuer Timer von 2,5 Sekunden bevor die neue Ausgabe kommt
						 */
						
						Timer konto = new Timer();
						konto.schedule(new TimerTask() 
						{
							@Override
							public void run()
							{
								System.out.println("Ihr Konto ist jetzt leer. Bitte beehren Sie uns bald wieder.");
								
								System.exit(0);
							}	
						}, 2500);
	
					}
					sc.close();

				
			}			//Ende vom Überschreiben der Run Methode: "public void run" 
		}						// Ende Userinput


		Userinput uinp = new Userinput();
		uinp.start();
		
		
	}	//Ende public static void main(String[] args) 

	
}

	
