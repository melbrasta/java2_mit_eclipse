package dateTime;

import java.util.Scanner;
import java.time.LocalDate;

public class WochentagAusDatum
{
	public static void main(String[] args)
	{

		userinput();

	}

	public static void userinput()
	{
		String input = null;
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Bitte geben Sie ein Datum ein, um den Wochentag zu bestimmen. [yyyy-mm-dd] ");
		input = sc.nextLine();

		// LocalDate ld = LocalDate.parse("2050-06-15");
		if (input.length() == 10)
		{
			LocalDate ud = LocalDate.parse(input);
			System.out.println(ud + " hat folgendes Ergebnis gefunden: "
					+ ud.getDayOfWeek());
			sc.close();
		} else
		{
			userinput();
		}
	}

}
