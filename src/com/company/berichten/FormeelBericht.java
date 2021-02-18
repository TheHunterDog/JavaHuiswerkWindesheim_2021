package com.company.berichten;

public class FormeelBericht extends Bericht {
    public FormeelBericht(String voornaam, String achternaam, String mv, String text) {
        super(voornaam, achternaam, mv, text);
    }

    public void printBericht(){
        System.out.println("Geachte "+ getMv() +" "+ getAchternaam() +",\n" +
                 getText()+"\n" +
                "hoogachtend,\n");
    }
}
