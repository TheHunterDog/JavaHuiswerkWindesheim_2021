package com.company;

public class Bedrijf {
    private String naam;
    private int opgerichtin;

    public Bedrijf(String naam, int opgerichtin) {
        this.naam = naam;
        this.opgerichtin = opgerichtin;
    }

    public String getNaam() {
        return naam;
    }

    public int getOpgerichtin() {
        return opgerichtin;
    }
}
