public class Main {
    public static void main(String[] args) {
        // Erstellung der Objekte
        Schueler oSchueler_1 = new Schueler();
        Schueler oSchueler_2 = new Schueler();
        Lehrer oLehrer_1 = new Lehrer();

        // Daten festlegen
        oSchueler_1.iPersonalnummer = 1;
        oSchueler_1.strVorname = "Daniel";
        oSchueler_1.strName = "Baum";
        oSchueler_1.strStrasse = "Neustädter Str. 1";
        oSchueler_1.strOrt = "Leipzig";
        oSchueler_1.strPLZ = "04315";
        oSchueler_1.strKlasse = "IT21/1";

        oSchueler_2.iPersonalnummer = 2;
        oSchueler_2.strVorname = "Moritz";
        oSchueler_2.strName = "Krause";
        oSchueler_2.strStrasse = "Neustädter Str. 1";
        oSchueler_2.strOrt = "Leipzig";
        oSchueler_2.strPLZ = "04315";
        oSchueler_2.strKlasse = "IT21/2";

        oLehrer_1.iPersonalnummer = 3;
        oLehrer_1.strVorname = "Klaus";
        oLehrer_1.strName = "Wannemaker";
        oLehrer_1.strStrasse = "An d. Querbreite 8";
        oLehrer_1.strOrt = "Leipzig";
        oLehrer_1.strPLZ = "04129";
        oLehrer_1.strFach = "LF8";

        // Daten erfassen

        // Ausweise drucken --> Ausgabe in der Konsole
        oSchueler_1.druckeAusweis();
        oSchueler_2.druckeAusweis();
        oLehrer_1.druckeAusweis();

        // Ausweise drucken --> Ausgabe in Datei

        // Information --> Ausgabe in der Konsole
    }
}