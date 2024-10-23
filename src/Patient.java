public class Patient extends Person{

    private int kvnr;

    public Patient (String name, String geburtsdatum, int telefonnummer, char geschlecht, int kvnr) {
        super(name, geburtsdatum, telefonnummer, geschlecht);
        this.kvnr = kvnr;
    }

    public int getKvnr() {
        return kvnr;
    }
    public void setKvnr(int kvnr) {
        this.kvnr = kvnr;
    }

    public void abfrageTermin(Termin termin) {
        System.out.println("\nPatient ==> Abfrage Termin: " + this.getName());
        termin.zeigenTermin();
    }
    public Termin erstelleTermin(Patient patient, Arzt arzt, String grund, String datum, String uhrzeit) {
        String erstellt = "\n // Termin von Patient geaendert:";
        System.out.println(erstellt);
        Termin termin = new Termin(patient,arzt,grund,datum,uhrzeit);
        return termin;
    }

}
