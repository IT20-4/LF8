import ea.Kon;

public class Person {
 
	//Attribute
	private final int   iPNr;	//final -> Konstante
	private String strName;
	private String strVorname;
	private String strPLZ;
	private String strOrt;
	private String strStrasse;
	//static -> Klassenvariable erzeugen
	private static int iAnzahlPersonen = 0;

	//Konstruktoren
	public Person() {
		//Standardwerte setzen
		iAnzahlPersonen++;	//Klassenvariable (kursiv geschrieben)
		iPNr 		= iAnzahlPersonen;
		strName 	= "Mustermann";
		strVorname 	= "Max";
	}
	
	///////     Getter/Setter	/////////////////////
	public int getPNr() {
		return iPNr;
	}

	//Methode l�schen!!!!
//	public void setPNr(int iPNr) {
//		this.iPNr = iPNr;
//	}

	public String getName() {
		return strName;
	}

	public void setName(String strName) {
		this.strName = strName;
	}

	public String getVorname() {
		return strVorname;
	}

	public void setVorname(String strVorname) {
		this.strVorname = strVorname;
	}

	public String getPLZ() {
		return strPLZ;
	}

	public void setPLZ(String strPLZ) {
		//PLZ auf G�ltigkeit pr�fen
		this.strPLZ = strPLZ;
	}

	public String getOrt() {
		return strOrt;
	}

	public void setOrt(String strOrt) {
		this.strOrt = strOrt;
	}

	public String getStrasse() {
		return strStrasse;
	}

	public void setStrasse(String strStrasse) {
		this.strStrasse = strStrasse;
	}
	
	public static int getAnzahlPersonen() {
		return iAnzahlPersonen;
	}
	///////     Ende von Getter/Setter	/////////////////////

	//Methoden
	public void druckeAusweis() {
		//auf den Bildschirm ausgeben
		System.out.println("Personalnummer:\t" + iPNr);
		System.out.println("Name:\t\t" 		+ strName);
		System.out.println("Vorname:\t" 	+ strVorname);
	}
	 
	public void erfasseDaten() {
//		System.out.print("Personal-Nr.:\t");	//wird jetzt automatisch erhöht
//		iPNr 		= Kon.iEingabe();
		System.out.print("Name:\t");
		strName 	= Kon.strEingabe();
		System.out.print("Vorname:");
		strVorname 	= Kon.strEingabe();
	} 
}
 
