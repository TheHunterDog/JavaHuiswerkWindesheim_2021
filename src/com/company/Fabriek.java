package com.company;

public class Fabriek {
    private int aantalGemaakteAutos;
    private static int totaalaantalGemaakteAutos;
    private String naam;
    private int productieFout;
    public Fabriek(){
        naam = "Tesla";
    }
    public Fabriek(String naam){
        this.naam = naam;
    }
    public Auto maakAuto(){
        aantalGemaakteAutos++;
        totaalaantalGemaakteAutos++;
        return new Auto("Tesla","Model 3", 360,this.naam);
    }
    public Auto maakAuto(String merk, String type, int pk){
        totaalaantalGemaakteAutos++;
        aantalGemaakteAutos++;
        return new Auto(merk,type,pk,this.naam);
    }

    public int getAantalGemaakteAutos() {
        return aantalGemaakteAutos;
    }

    public static int getTotaalaantalGemaakteAutos() {
        return totaalaantalGemaakteAutos;
    }
    public void PrintTotaalAutosGemaakt(){
        System.out.println("aantal: " + this.getTotaalaantalGemaakteAutos());
    }
    public void registreerProductieFout(){
        productieFout++;
    }
    public int getzonderProductiefouten(){
        return aantalGemaakteAutos - productieFout;
    }
}
