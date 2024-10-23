public class Person {

    private String name;
    private String geburtsdatum;
    private int telefonnummer;
    private char geschlecht;

    public Person(String name, String geburtsdatum, int telefonnummer, char geschlecht) {
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.telefonnummer = telefonnummer;
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }
    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }
    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public char getGeschlecht() {
        return geschlecht;
    }
    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }


}
