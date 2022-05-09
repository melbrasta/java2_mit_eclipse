package testing;

public class Produkt {

	private int produktId;


	private String produktName;
	private int produktKategorie;
	
	private int produktPreis;
	
	
	public Produkt(String produktName, int produktKategorie, int produktPreis) {
		this(0, produktName,produktKategorie,produktPreis);
	}
	
	
	public Produkt(int produktId, String produktName, int produktKategorie, int produktPreis) {
		super();
		this.produktId = produktId ;
		this.produktName = produktName;
		this.produktKategorie = produktKategorie;
		this.produktPreis = produktPreis;
	}


	public String getProduktName() {
		return produktName;
	}


	public int getProduktKategorie() {
		return produktKategorie;
	}


	public int getProduktPreis() {
		return produktPreis;
	}
	
	
	public int getProduktId() {
		return produktId;
	}


	public void setProduktId(int produktId) {
		this.produktId = produktId;
	}

	
}
