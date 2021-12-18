public class Lehrer extends Person {
    // Attribute
    public String strFach;

    // Konstruktor
    public Lehrer() {
        super();
        strFach = "Informatik";
    }

    // Methoden
    public void druckeAusweis() {
        super.druckeAusweis();
        System.out.println("Fach:           " + strFach);  
    }

    public void erfasseDaten(){
        super.erfasseDaten();
    }
}
