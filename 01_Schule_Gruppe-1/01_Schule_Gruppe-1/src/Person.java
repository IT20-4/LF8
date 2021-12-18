public class Person {
    // Attribute
    public int iPersonalnummer;
    public String strVorname;
    public String strName;
    public String strStrasse;
    public String strOrt;
    public String strPLZ;

    // Konstruktor
    public Person() {
        // Standardwerte setzen
        iPersonalnummer = 0;
        strVorname = "Max";
        strName = "Mustermann";
        strStrasse = "Musterstraße 1";
        strOrt = "Muserort";
        strPLZ = "01234";
    }

    // Methoden
    public void druckeAusweis() {
        System.out.println("\n\n--- Ausweis ---");
        System.out.println("Personalnummer: " + iPersonalnummer);
        System.out.println("Vorname:        " + strVorname);
        System.out.println("Name:           " + strName);
        System.out.println("Straße:         " + strStrasse);
        System.out.println("Ort:            " + strOrt);
        System.out.println("PLZ:            " + strPLZ);
    }

    public void erfasseDaten() {

    }
}
