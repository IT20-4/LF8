public class Schueler extends Person {
 
	//Attribute
	private String strKlasse;
	
	//Konstruktor
	public Schueler() {
		super();
		strKlasse = "1a";
	}
	
	///////     Getter/Setter	/////////////////////
	public String getKlasse() {
		return strKlasse;
	}

	public void setKlasse(String strKlasse) {
		this.strKlasse = strKlasse;
	}///////     Ende von Getter/Setter	/////////////////////

	//Methoden �berschreiben (neu programmieren)
	public void erfasseDaten() {
		super.erfasseDaten();  //Methode der Elternklasse aufrufen 
		System.out.print("Klasse:\t");
		strKlasse = ea.Kon.strEingabe();
	}
	
	public void druckeAusweis() {
		super.druckeAusweis();
		System.out.println("Klasse:\t" + strKlasse);
	}
	
	
}
 
