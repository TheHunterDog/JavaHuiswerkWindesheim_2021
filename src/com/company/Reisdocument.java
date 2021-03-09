package com.company;

public abstract class Reisdocument implements Legitimatiebewijs{
    abstract String getGeldigeLanden();

//    public Reisdocument(String naam, String BSN) {
//        this.naam = naam;
//        this.BSN = BSN;
//    }

    @Override
    public String toString() {
        return  "type: " + getDocumentType() + " geldig in " + getGeldigeLanden();
    }

    protected String naam;
    protected String BSN;

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public String getBSN() {
        return BSN;
    }




}
