package algorithmikaufgaben.personen;


public class Personen 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}
	
	private String firstname;
	private String lastname;
	private int age;
	private int height;
	
	public Personen( String firstname, String lastname ,int age, int height ) 
	{
		this.firstname = firstname;
		this.lastname = lastname;	
		this.age = age;
		this.height = height;
				
	}
	
	
	
	public String getFirstname( ) {
		return this.firstname;
	}
	
	public String getLastname() {
		return  this.lastname;
	}
	
	public String getFullname() {
		return this.getFirstname() + " "  + this.getLastname();
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public String getInfo()
	{
		return this.getFullname() + " "  + this.getAge() + " " + this.getHeight();
	}
	
	public String toString() {
		return this.getInfo();
	}
		
	@Override
	public boolean equals( Object obj)  {
		
		if( obj instanceof Personen ) {
			Personen p = (Personen) obj;
			
			return this.firstname.equals( p.firstname ) 
					&& this.lastname.equals( p.lastname );	
		}
		
		return false;
	}

}
