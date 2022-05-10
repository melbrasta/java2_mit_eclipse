package testingAufgaben;

public class Employee
{
	private String Vorname;
	private String Nachname;
	private int Mitarbeiternummer;
	
	
	public Employee (String Vorname, String Nachname, int Mitarbeiternummer)
	{
		super();
		this.Vorname = Vorname;
		this.Nachname = Nachname;
		this.Mitarbeiternummer = Mitarbeiternummer;
		
	}


	public String getVorname()
	{
		return Vorname;
	}


	public String getNachname()
	{
		return Nachname;
	}


	public int getMitarbeiternummer()
	{
		return Mitarbeiternummer;
	}
	
	
	
	
	
	
}
