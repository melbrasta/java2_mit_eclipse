package dateTime;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class ZweiDatenDifferenz
{

	public static void main(String[] args)
	{

		userinput();

	}

	public static void userinput()
	{
		String input1 = null;
		String input2 = null;
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Bitte geben Sie das erste Datum ein. [yyyy-mm-dd] ");
		input1 = sc.nextLine();
		System.out
				.println("Bitte geben Sie das zweite Datum ein. [yyyy-mm-dd] ");
		input2 = sc.nextLine();

		if (input1.length() == 10 && input2.length() == 10)
		{
			LocalDate ud1 = LocalDate.parse(input1);
			System.out.println(ud1);
			LocalDate ud2 = LocalDate.parse(input2);
			System.out.println(ud2);

			long dateDiff = ud1.toEpochSecond(LocalTime.of(0, 0),
					ZoneOffset.UTC)
					- ud2.toEpochSecond(LocalTime.of(0, 0), ZoneOffset.UTC);
			long days = dateDiff / 86400;
			long years = days / 365;

			System.out.println("zwischen beiden Daten liegen: " + years
					+ " Jahre. Genauer gesagt: " + days + " Tage.");

			sc.close();
		} else
		{
			userinput();
		}

	}
}
