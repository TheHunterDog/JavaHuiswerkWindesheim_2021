package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Chat {
    private String naam;
    private ArrayList<Bericht> berighten = new ArrayList<>();

    public Chat(String naam){
        this.naam = naam;
    }
    public Chat(String naam, Bericht bericht){
        this(naam);
        addBericht(bericht);
    }
    public String toString() {
        return "Chat:" + naam + "\nBerichten:" + this.berighten;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Bericht> getBerighten() {
        return berighten;
    }
    public void addBericht(Bericht ber){
        berighten.add(ber);
    }
    public void printBerichtenSinds(LocalDateTime datum) {
        for (Bericht ber :
                berighten) {
            if (ber.getDatum().isAfter(datum)) {
                System.out.println(ber);
            }

        }
    }
    public void printBerichtenVan(Gebruiker geb) {
        for (Bericht ber :
                berighten) {
            if (geb.equals(ber.getGebruiker())) {
                System.out.println(ber);
            }
        }
    }
    public ArrayList<Bericht> ZoekBerichtenVan(Gebruiker gebruiker){
        ArrayList<Bericht> mem = new ArrayList<>();
        for (Bericht ber :
                berighten) {
            if(ber.getGebruiker().equals(gebruiker)){
                mem.add(ber);
            }
        }
        return mem;
    }

    public ArrayList<Bericht> ZoekBerichten(String bericht){
        ArrayList<Bericht> mem = new ArrayList<>();
        for (Bericht ber :
                berighten) {
            if(ber.getBericht().equals(bericht)){
                mem.add(ber);
            }
        }
        return mem;
    }
    public ArrayList<Bericht> ZoekBerichtenVan(ArrayList<Gebruiker> gebruikers){
        ArrayList<Bericht> mem = new ArrayList<>();
        for (Bericht ber :
                berighten) {
            if(gebruikers.contains(ber.getGebruiker())){
                mem.add(ber);
            }
        }
        return mem;
    }
}
