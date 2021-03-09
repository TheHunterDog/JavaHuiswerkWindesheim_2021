package com.company;

public class natuurlijkpersoon extends Postpersoon {
    private String achternaam;
    private String tussenvoegsel;
    private String voornaam;
    private String voorletters;
    private char geslacht;


    @Override
    public String getaan() {
        return "Aan: "+(this.geslacht == 'm' ? "meneer": "mevrouw ")+" "+this.voorletters+" "+this.tussenvoegsel+" "+this.achternaam+"\n" + getAdres();}

    @Override
    public String getGeachte() {
        return "Geachte: "+(this.geslacht == 'm' ? "meneer": "mevrouw ") + tussenvoegsel + achternaam;
    }
}