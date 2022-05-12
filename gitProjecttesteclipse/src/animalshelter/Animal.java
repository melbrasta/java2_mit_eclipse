package animalshelter;

import java.time.LocalDate;

public class Animal {
	private int type;
	private String name;
	private LocalDate dob;
	private int temper;
	private boolean adoptable;
	
	
	public Animal(int type, String name, LocalDate dob, int temper, boolean adoptable) {
		super();
		this.type = type;
		this.name = name;
		this.dob = dob;
		this.temper = temper;
		this.adoptable = adoptable;
	}


	public int getType() {
		return type;
	}
	



	public String getName() {
		return name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public int getTemper() {
		return temper;
	}


	public boolean isAdoptable() {
		return adoptable;
	}
	

	public void setName(String name) {
		this.name = name;
	}


	public void setTemper(int temper) {
		this.temper = temper;
	}


	public void setAdoptable(boolean adoptable) {
		this.adoptable = adoptable;
	}
	
	
	
	
	
	

}
