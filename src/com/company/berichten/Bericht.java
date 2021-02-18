package com.company.berichten;

public abstract class Bericht {
    private String voornaam;
    private String achternaam;
    private String mv; // boolean is handiger
    private String text;

    public Bericht(String voornaam, String achternaam, String mv, String text) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.mv = mv;
        this.text = text;
    }

    public abstract void printBericht();
    public String toString() {
        return "Bericht{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", mv='" + mv + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getMv() {
        return mv;
    }

    public String getText() {
        return text;
    }
}
