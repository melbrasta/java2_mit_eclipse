package algorithmikaufgaben.personen;

public class Mitarbeiter extends Personen
{
	private int personalnr;

	public Mitarbeiter(String firstname, String lastname, int age, int personalnr)
		{
			super(firstname, lastname, age);
			this.setPersonalnr(personalnr);
		}

	
	


	public int getPersonalnr()
	{
		return personalnr;
	}



	public void setPersonalnr(int personalnr)
	{
		this.personalnr = personalnr;
	}

	
	

	public String toString() 
	{
		return "\nMitarbeiter: " + this.getInfo() + "\nMitarbeiternummer: " + this.getPersonalnr();
	}

	
	
}
