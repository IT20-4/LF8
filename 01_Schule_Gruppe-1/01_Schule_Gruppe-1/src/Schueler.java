public class Schueler extends Person {
    // Attribute
    public String strKlasse;

    // Konstruktor
    public Schueler() {
        super();
        strKlasse = "ITXX/X";
    }

    // Methoden
    public void druckeAusweis() {
        super.druckeAusweis();
        System.out.println("Klasse:         " + strKlasse);  
    }

    public void erfasseDaten(){
        super.erfasseDaten();
    }
}
