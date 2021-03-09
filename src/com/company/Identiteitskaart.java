package com.company;

public class Identiteitskaart extends Reisdocument {
    public Identiteitskaart(String naam, String bsn) {
        this.naam = naam;
        this.BSN = bsn;
    }


    @Override
    public String getDocumentType() {
        return "Identiteitskaart";
    }

    @Override
    String getGeldigeLanden() {
        return "Europa";
    }
}
