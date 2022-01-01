public class Lehrer extends Person {
    // Attribute
    private String strFach;

    // Konstruktor
    public Lehrer() {
        super();
        strFach = "Informatik";
    }

    // Anfang von Getters/Setters
    public String getFach() {
        return this.strFach;
    }

    public void setFach(String strFach) {
        this.strFach = strFach;
    }
    // Ende von Getters/Setters

    // Methoden
    public void erfasseDaten(){
        super.erfasseDaten();
    }

    public void druckeAusweis() {
        super.druckeAusweis();
        System.out.println("Fach:           " + strFach);  
    }
}
