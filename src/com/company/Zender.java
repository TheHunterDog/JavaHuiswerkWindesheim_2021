package com.company;

public class Zender {
    private String naam;
    private int zendernummer;
    private Bedrijf bedrijf;

    public Zender(String naam, int zendernummer, Bedrijf bedrijf) {
        this.naam = naam;
        this.zendernummer = zendernummer;
        this.bedrijf = bedrijf;
    }

    public String getNaam() {
        return naam;
    }

    public int getZendernummer() {
        return zendernummer;
    }

    public String toString() {
        return "\nZender{" +
                "naam='" + naam + '\'' +
                ", zendernummer=" + zendernummer +
                '}';
    }
}
