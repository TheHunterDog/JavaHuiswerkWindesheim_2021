package com.company;

public class Gebruiker {
    private String naam;
    private int leeftijd;

    public Gebruiker(String naam){
        this.naam = naam;
    }
    public Gebruiker(String naam,int leeftijd){
        this(naam);
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return this.naam + " " + this.leeftijd;
    }
}
