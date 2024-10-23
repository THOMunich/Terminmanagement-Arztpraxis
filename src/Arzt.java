public class Arzt extends Person{


    private String spezialgebiet;

    public Arzt(String name, String geburtsdatum, int telefonnummer, char geschlecht, String spezialgebiet) {
        super (name, geburtsdatum, telefonnummer, geschlecht);
        this.spezialgebiet = spezialgebiet;
    }

    public String getSpezialgebiet() {
        return spezialgebiet;
    }
    public void setSpezialgebiet(String spezialgebiet) {
        this.spezialgebiet = spezialgebiet;
    }

    public Termin neuerTermin(String grund, String uhrzeit, String datum, Patient patient) {
        Termin neuerTermin = new Termin(patient,this,grund,datum,uhrzeit);
        System.out.println("\nArzt ==> neuer Termin erstellt: ");
        neuerTermin.zeigenTermin();
        return neuerTermin;
    }

    public void aendernTermin(Termin termin, String datum, String uhrzeit, String grund) {
        termin.setDatum(datum);
        termin.setUhrzeit(uhrzeit);
        termin.setGrund(grund);
        System.out.println("\nArzt ==> Termin geändert: ");
        termin.zeigenTermin();
    }

}
