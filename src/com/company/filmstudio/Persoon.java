package com.company.filmstudio;

public abstract class Persoon {
    private String naam;
    private String geboortedatum;
    private boolean sexe; // false is WOMAN

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public boolean isSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }
    public abstract String toString();
    public abstract void print();
    public abstract double berekenBeloning(int draaidagen);
}
