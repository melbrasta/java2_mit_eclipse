package dateTime;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class CounterToWeekend
{

	public static void main(String[] args)
	{
		userinput();

	}
	
	public static void userinput()
	{
		

			LocalDate ldn = LocalDate.now();
			System.out.println("jetzt " + ldn);
			
			
			
			
//			
//
//			long dateDiff = ldn.toEpochSecond(LocalTime.of(0, 0),
//					ZoneOffset.UTC)
//					- ud2.toEpochSecond(LocalTime.of(0, 0), ZoneOffset.UTC);
//			long days = dateDiff / 86400;
//			long years = days / 365;
//
//			System.out.println("zwischen beiden Daten liegen: " + years
//					+ " Jahre. Genauer gesagt: " + days + " Tage.");
//		

	}
}
