public class Termin {

    private String datum;
    private String uhrzeit;
    private String grund;
    private Arzt arzt;
    private Patient patient;

    public Termin (Patient patient, Arzt arzt, String grund, String datum, String uhrzeit) {
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.grund = grund;
        this.arzt = arzt;
        this.patient = patient;
    }

    public String getDatum() {
        return datum;
    }
    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getUhrzeit() {
        return uhrzeit;
    }
    public void setUhrzeit(String uhrzeit) {
        this.uhrzeit = uhrzeit;
    }

    public String getGrund() {
        return grund;
    }
    public void setGrund(String grund) {
        this.grund = grund;
    }

    public Arzt getArzt() {
        return arzt;
    }
    public void setArzt(Arzt arzt) {
        this.arzt = arzt;
    }

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void zeigenTermin() {
        System.out.println("Patient: " + patient.getName() + " | KVS Nr.: " + patient.getKvnr() + " | GB: "
                + patient.getGeburtsdatum() + " | Arzt: " + arzt.getName() + " | Fachgebiet: " + arzt.getSpezialgebiet()
                + " | Grund: " + grund + " | Datum: " + datum + " | Uhrzeit: " + uhrzeit);
    }

}