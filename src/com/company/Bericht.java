package com.company;

import java.time.LocalDateTime;

public class Bericht {
    private Gebruiker gebruiker;
    private String bericht;
    private LocalDateTime datum;
    public Bericht(String bericht,Gebruiker gebruiker){
        this.bericht = bericht;
        this.gebruiker = gebruiker;
        this.datum = LocalDateTime.now();
    }
    @Override
    public String toString() {
        return this.gebruiker+ " ("+ this.datum+") :" + this.bericht;
    }
    public Bericht(Gebruiker gebruiker, String bericht, LocalDateTime datum){
        this(bericht,gebruiker);
        this.datum = datum;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public String getBericht() {
        return bericht;
    }

    public LocalDateTime getDatum() {
        return datum;
    }
}

