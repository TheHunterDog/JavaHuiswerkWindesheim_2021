package com.company.berichten;

public class InformeelBericht extends Bericht {
    public InformeelBericht(String voornaam, String achternaam, String mv, String text) {
        super(voornaam, achternaam, mv, text);
    }

    public void printBericht(){
        System.out.println("Hey "+getVoornaam()+",\n" +
                getText()+".\n" +
                "later!\n");
    }
}
