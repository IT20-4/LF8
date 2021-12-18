public class Person {
    // Attribute
    private int iPersonalnummer;
    private String strVorname;
    private String strName;
    private String strStrasse;
    private String strOrt;
    private String strPLZ;

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

    // Anfang von Getters/Setters
    public int getPersonalnummer() {
        return this.iPersonalnummer;
    }

    public void setPersonalnummer(int iPersonalnummer) {
        this.iPersonalnummer = iPersonalnummer;
    }

    public String getVorname() {
        return this.strVorname;
    }

    public void setVorname(String strVorname) {
        this.strVorname = strVorname;
    }

    public String getName() {
        return this.strName;
    }

    public void setName(String strName) {
        this.strName = strName;
    }

    public String getStrasse() {
        return this.strStrasse;
    }

    public void setStrasse(String strStrasse) {
        this.strStrasse = strStrasse;
    }

    public String getOrt() {
        return this.strOrt;
    }

    public void setOrt(String strOrt) {
        this.strOrt = strOrt;
    }

    public String getPLZ() {
        return this.strPLZ;
    }

    public void setPLZ(String strPLZ) {
        this.strPLZ = strPLZ;
    }
    // Ende von Getters/Setters

    // Methoden
    public void erfasseDaten() {}

    public void druckeAusweis() {
        System.out.println("\n\n--- Ausweis ---");
        System.out.println("Personalnummer: " + iPersonalnummer);
        System.out.println("Vorname:        " + strVorname);
        System.out.println("Name:           " + strName);
        System.out.println("Straße:         " + strStrasse);
        System.out.println("Ort:            " + strOrt);
        System.out.println("PLZ:            " + strPLZ);
    }
}

