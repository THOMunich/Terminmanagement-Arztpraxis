
public class Main {
    // Prg soll Arztpraxis simulieren - Termine werden vom Arzt vergeben und geändert
    // Patient kann jederzeit Termine abfragen und selbst Termine ändern
    // Funktionsaufruf in der Main

    public static void main(String[] args) {

        Arzt arzt = new Arzt("Dr. Maier", "12.04.1975", 123456789, 'M', "Allgemeinmediziner");
        Arzt arzt2 = new Arzt("Dr. Mahan", "14.01.1966", 38009329, 'm', "Internist");
        Patient patient = new Patient("Herr Test", "20.07.1990", 987654321, 'M', 654153);

        Termin termin = arzt.neuerTermin("Blutkontrolle", "14:30", "20.09.2024", patient);
        patient.abfrageTermin(termin);

        arzt.aendernTermin(termin, "2024-09-21", "15:00", "Hirnscan");
        patient.abfrageTermin(termin);

        Termin termin2 = patient.erstelleTermin(patient, arzt2, "Zeitmangel Dr. Maier", "21.09.2024", "16:00");
        patient.abfrageTermin(termin2);

    }
}
