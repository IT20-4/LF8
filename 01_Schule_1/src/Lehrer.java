public class Lehrer extends Person {
 
	//Attribute
	private String strFach;

	//Konstruktoren
	
	////////     Getter/Setter	/////////////////////
	public String getFach() {
		return strFach;
	}

	public void setFach(String strFach) {
		this.strFach = strFach;
	}///////     Ende von Getter/Setter	//////////////
	
	//Methoden �berschreiben (neu programmieren)
	public void erfasseDaten() {
		super.erfasseDaten();  //Methode der Elternklasse aufrufen 
		System.out.print("Fach:\t");
		strFach = ea.Kon.strEingabe();
	}
	
	public void druckeAusweis() {
		super.druckeAusweis();
		System.out.println("Fach:\t" + strFach);
	}	 
}
 
