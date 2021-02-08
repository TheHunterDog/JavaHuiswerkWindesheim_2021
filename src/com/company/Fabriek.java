package com.company;

public class Fabriek {
    private String naam;
    public Fabriek(){
        naam = "Tesla";
    }
    public Fabriek(String naam){
        this.naam = naam;
    }
    public Auto maakAuto(){
        return new Auto("Tesla","Model 3", 360,this.naam);
    }
    public Auto maakAuto(String merk, String type, int pk){
        return new Auto(merk,type,pk,this.naam);
    }
}
