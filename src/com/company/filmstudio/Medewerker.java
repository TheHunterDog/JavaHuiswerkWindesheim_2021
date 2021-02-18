package com.company.filmstudio;

public class Medewerker extends Persoon
{
    private String functie;
    private int loon;

    public Medewerker(String functie, String naam, String geboortedatum,Boolean sexe) {
        this.functie = functie;
        setNaam(naam);
        setGeboortedatum(geboortedatum);
        setSexe(sexe);
    }
    public Medewerker(String functie, String naam, String geboortedatum,Boolean sexe, int loon) {
        this.functie = functie;
        setNaam(naam);
        setGeboortedatum(geboortedatum);
        setSexe(sexe);
        this.loon = loon;
    }

    public String getFunctie() {
        return functie;
    }

    @Override
    public String toString() {
        return getNaam()+" - " + functie;
    }

    public void print() {
        System.out.println(getNaam()+" - " + functie);
    }

    @Override
    public double berekenBeloning(int draaidagen) {
        if (loon != 0){
            return loon * draaidagen;

        }
        return draaidagen;
    }
}
