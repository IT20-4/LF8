/* Entwickeln Sie eine Schul-Verwaltungs-Software
 * f�r das BSZ7! Es gibt Sch�ler und Lehrer. Lehrer
 * unterrichten nur in einem Fach.
 * Alle anderen Mitarbeiter einer Schule sind Personen.
 */
public class Main {

	public static void main(String[] args) {
		// Hier werden die Klassen benutzt
		Schueler oSchueler_1  = new Schueler();
		Schueler oSchueler_2  = new Schueler();
		Lehrer   oLehrer_1    = new Lehrer();
		Person   oHausMeister = new Person();
		
//		//soll nicht mehr m�glich sein -> private
////		oSchueler_1.iPNr 	= 1;
////		oSchueler_1.strName = "M�ller";
//		//sondern �ber Methoden �ndern (z.B. setMethode)
//		oSchueler_1.erfasseDaten();  //oder erfasseDaten()
//		
////		oSchueler_2.iSNr 	= 2;
////		oSchueler_2.strName = "Richter";
//		oSchueler_2.erfasseDaten();
//		
//		oLehrer_1.erfasseDaten();
		
		System.out.println("\nAusweise drucken:\n");
		oSchueler_1.druckeAusweis();
		oSchueler_2.druckeAusweis();
		oLehrer_1.druckeAusweis();
		
		///Achtung , das soll nicht m�glich sein
		//oSchueler_1.iPNr = 1000;
		//System.out.println("Name Schueler 2: " + oSchueler_2.getName());
		System.out.println(Person.getAnzahlPersonen() + " Personen insgesamt erzeugt.");
		//folgende Zeilen sind auch möglich, sollten aber vermieden werden
		System.out.println(Schueler.getAnzahlPersonen() + " Personen insgesamt erzeugt.");
		System.out.println(oLehrer_1.getAnzahlPersonen() + " Personen insgesamt erzeugt.");
	}

}
