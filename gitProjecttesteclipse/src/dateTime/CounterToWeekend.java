package dateTime;

import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
		

			int ldtn = LocalDateTime.now().getSecond();
			System.out.println("aktuelle Sekunden " + ldtn);
			
			
			 
			
			DayOfWeek dayname = LocalDate.now().getDayOfWeek();
			System.out.println(dayname);

	}
}
