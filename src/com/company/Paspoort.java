package com.company;

public class Paspoort extends Reisdocument{
    public Paspoort(String naam, String bsn) {
        this.naam = naam;
        this.BSN = bsn;
    }

    @Override
    public String toString() {
        return "Paspoort{" +
                "naam='" + naam + '\'' +
                ", BSN='" + BSN + '\'' +
                '}';
    }

    @Override
    public String getDocumentType() {
        return "Paspoort";
    }

    @Override
    String getGeldigeLanden() {
        return "de hele wereld";
    }
}
