package com.company;

public abstract class Postpersoon {
    private Postcode postcode;
    protected int huisnummer;
    protected String toevoeging;

    public abstract String getaan();
    public abstract String getGeachte();
    public String getAdres(){
        return postcode.getStraatnaam() + huisnummer + "\n" + postcode.getCode() + postcode.getWoonplaats() + "\n";
    }
    public void Setpostcode(String pc){

    }
}
