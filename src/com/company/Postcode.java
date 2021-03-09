package com.company;

import java.util.ArrayList;

public class Postcode {
    private static ArrayList<Postcode> lijst;
    private String code;
    private String woonplaats;
    private String straatnaam;
    public static void createPostcode(String pc, String wp, String sn)
    {
        // zoek de postcode op
        Postcode lpc = Postcode.findPostcode(pc);
        if (lpc == null )
        {
            // niet te vinden: dus toevoegen aan de lijst
            lijst.add(new Postcode(pc, wp, sn));
        }
        else
        {
            // al aanwezig in ons systeem, dus aleen updaten:
            lpc.setWoonplaats(wp);
            lpc.setStraatnaam(sn);
        }
    }
    public static Postcode findPostcode(String pc){
        for (int i = 0; i < lijst.size(); i++) {
            if(lijst.get(i).code == pc){
                return lijst.get(i);
            }
        }
        return null;
    }
    private Postcode(String pc, String wp, String sn){
        this.code = pc;
        this.woonplaats = wp;
        this.straatnaam = sn;

    }
    public String getCode(){
        return this.code;

    }
    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }
}
