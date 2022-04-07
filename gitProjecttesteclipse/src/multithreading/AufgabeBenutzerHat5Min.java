package multithreading;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;





public class AufgabeBenutzerHat5Min
{
	static String input=null;


	public static void main(String[] args) 
	{
		class Userinput extends Thread
		{	
			@Override 
			public void run() 
			{
				Scanner sc = new Scanner(System.in);
				
				Timer t1 = new Timer( );
				
				t1.schedule(new TimerTask() 
				{

					private int counter= 5;
					
					@Override
					public void run() {
						System.out.println("Du hast noch "+  counter + " Sekunden für deine Eingabe." );
		 				if( this.counter <= 0) 
		 				{
	//						this.cancel();
		 					System.out.println("\nSo wird das nichts du lahme Schnecke.");
							System.exit(0);
						}
						counter--;			
					}
				// start, intervall
				}, 150, 1000);
				
					System.out.println("Bitte gib deine geheimsten Daten und Bankverbindungen ein:\n");
					input = sc.nextLine();	
					if(!input.equals(null))
					{
						t1.cancel();
						System.out.println("Danke. Ihr Konto wird gerade leer geräumt...\nBitte warten..");
						Timer konto = new Timer();
						konto.schedule(new TimerTask() {

							@Override
							public void run()
							{
								System.out.println("Ihr Konto ist jetzt leer. Bitte beehren Sie uns bald wieder.");
								
								System.exit(0);
							}
							
						}, 2500);
						
						
						
					}
					sc.close();
//				},0,1000);
				
			}
		}

	//	class ThreadTimer extends Thread
//		{
	//		@Override 
		//	public void run() 
			//{
				
				
//				while(this.isAlive())
//					System.out.println(this.getId());
				
//			}
//		}
		
//		ThreadTimer th1 = new ThreadTimer();
		Userinput uinp = new Userinput();
		uinp.start();
	//	th1.start();
		

		
		

		
		
			
		
		
	}

	
}

	
