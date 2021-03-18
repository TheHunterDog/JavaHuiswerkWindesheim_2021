package com.company.JframeVoorstelling;

public class Voorstelling {

    private String naam;
    private int aantalPlaatsen;
    private int aantalVerkocht;

    public Voorstelling(String naam, int aantal) {
        this.naam = naam;
        this.aantalPlaatsen = aantal;
        this.aantalVerkocht = 0;
    }

    public void verkoopKaartje() {
        if (aantalPlaatsen > 0) {
            aantalPlaatsen--;
            aantalVerkocht++;
        }
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    public int getAantalVerkocht() {
        return aantalVerkocht;
    }

}
