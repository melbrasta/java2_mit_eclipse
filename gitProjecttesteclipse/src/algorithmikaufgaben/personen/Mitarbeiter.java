package algorithmikaufgaben.personen;

public class Mitarbeiter extends Personen
{
	private int personalnr;
	private String abteilung;

	public Mitarbeiter(String firstname, String lastname, int age, int personalnr, String abteilung)
		{
			super(firstname, lastname, age);
			this.setPersonalnr(personalnr);
			this.abteilung = abteilung;
		}
	


	
	


	public int getPersonalnr()
	{
		return personalnr;
	}



	public void setPersonalnr(int personalnr)
	{
		this.personalnr = personalnr;
	}
	
	
	public String getMitarbeiterabteilung()
	{
		return abteilung;
		
	}

	
	

	public String toString() 
	{
	
		//	return "\nMitarbeiter: " + this.getInfo() + "\nMitarbeiternummer: " + this.getPersonalnr() + "\nArbeitet in Abteilung: \" " + getMitarbeiterabteilung() + "\"";
	return super.toString()+ " " + this.personalnr;
	}

	
	
}
