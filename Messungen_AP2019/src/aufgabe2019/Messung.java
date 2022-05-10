package aufgabe2019;

import java.time.LocalDate;
import java.time.LocalTime;


public class Messung {
	LocalDate datum;
	LocalTime zeit;
	int messArt;
	double istWert;
	double sollWert;
	
	public Messung(String datum, String zeit, int messArt, double istWert, double sollWert) {
		super();
		this.datum = LocalDate.parse( datum );
		this.zeit =  LocalTime.parse( zeit );
		this.messArt = messArt;
		this.istWert = istWert;
		this.sollWert = sollWert;
	}
	
	public Messung(LocalDate datum, LocalTime zeit, int messArt, double istWert, double sollWert) {
		super();
		this.datum = datum;
		this.zeit = zeit;
		this.messArt = messArt;
		this.istWert = istWert;
		this.sollWert = sollWert;
	}


	public LocalDate getDatum() {
		return datum;
	}


	public LocalTime getZeit() {
		return zeit;
	}


	public int getMessArt() {
		return messArt;
	}


	public double getIstWert() {
		return istWert;
	}


	public double getSollWert() {
		return sollWert;
	}
	

	
	public String toString(){
	    return "["+getDatum()+"] [" + getZeit()+"] ["+getMessArt()+"] [" + getIstWert() + "] [" + getSollWert()+ "]\n";
	}
	
	
}
