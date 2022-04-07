package multithreading;

import java.util.Timer;
import java.util.TimerTask;


public class AufgabeTimer {

	public static void main(String[] args) {
		Timer t1 = new Timer( );
		
		t1.schedule(new TimerTask() {

			private int counter= 0;
			
			@Override
			public void run() {
				System.out.println("Es sind "+  counter + " Sekunde vergangen" );

 				if( this.counter >= 5) 
 				{
					this.cancel();
					System.exit(0);
				}
				counter++;			
			}
		// start, intervall
		}, 0, 1000);

	}
}

	
