public class Schueler extends Person {
    // Attribute
    private String strKlasse;

    // Konstruktor
    public Schueler() {
        super();
        strKlasse = "ITXX/X";
    }

    // Anfang von Getters/Setters
    public String getKlasse() {
        return this.strKlasse;
    }

    public void setKlasse(String strKlasse) {
        this.strKlasse = strKlasse;
    }
    // Ende von Getters/Setters

    // Methoden
    public void druckeAusweis() {
        super.druckeAusweis();
        System.out.println("Klasse:         " + strKlasse);  
    }

    public void erfasseDaten(){
        super.erfasseDaten();
    }
}
