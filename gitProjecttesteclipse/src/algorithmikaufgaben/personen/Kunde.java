package algorithmikaufgaben.personen;



public class Kunde extends Personen
{
	
	
	private int kundennr;
	
	public Kunde (String firstname, String lastname, int age, int kundennr)
	{
		super(firstname, lastname, age);
		this.kundennr = kundennr;
	}
		
	
	public int getKundennr()
	{
		return this.kundennr;
	}
	

	
	public String toString() {
		return "\nKunde: " + this.getInfo() + "\nKundennummer: " + this.getKundennr();
	}
	
	
}
