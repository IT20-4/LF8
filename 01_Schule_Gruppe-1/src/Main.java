public class Main {
    public static void main(String[] args) {
        // Erstellung der Objekte
        Schueler oSchueler_1 = new Schueler();
        Schueler oSchueler_2 = new Schueler();
        Lehrer oLehrer_1 = new Lehrer();

        // Daten festlegen
        oSchueler_1.setVorname("Daniel");
        oSchueler_1.setName("Baum");
        oSchueler_1.setStrasse("Neustädter Str. 1");
        oSchueler_1.setOrt("Leipzig");
        oSchueler_1.setPLZ("04315");
        oSchueler_1.setKlasse("IT21/1");

        oSchueler_2.setVorname("Moritz");
        oSchueler_2.setName("Krause");
        oSchueler_2.setStrasse("Neustädter Str. 1");
        oSchueler_2.setOrt("Leipzig");
        oSchueler_2.setPLZ("04315");
        oSchueler_2.setKlasse("IT21/2");

        oLehrer_1.setVorname("Klaus");
        oLehrer_1.setName("Wannemaker");
        oLehrer_1.setStrasse("An d. Querbreite 8");
        oLehrer_1.setOrt("Leipzig");
        oLehrer_1.setPLZ("04129");
        oLehrer_1.setFach("LF8");

        // Daten erfassen

        // Ausweise drucken --> Ausgabe in der Konsole
        oSchueler_1.druckeAusweis();
        oSchueler_2.druckeAusweis();
        oLehrer_1.druckeAusweis();

        // Ausweise drucken --> Ausgabe in Datei

        // Information --> Ausgabe in der Konsole
    }
}