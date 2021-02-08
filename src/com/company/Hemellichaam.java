package com.company;

public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin = 0;
    private int tempMax = 0;

    public Hemellichaam(String naam, String type){
        this.naam = naam;
        this.type = type;
    }
    public Hemellichaam(String naam){
        this.naam = naam;
    }


    @Override
    public String toString() {
        return naam +"("+(type == null ? "Onbekend" : type)+")";
    }

    public String getNaam() {
        return naam;
    }


    public void setType(String type) {
        System.out.println("Het type van "+naam+" verandert van "+this.type+" naar "+ type);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTemperatuur(int temp){
        this.tempMax = temp;
        this.tempMin = temp;
    }
    public void setTemperatuur(int min,int max){
        this.tempMin = min;
        this.tempMax = max;
    }
    public void printTemperatuur() {
        if (tempMin == tempMax) {
            System.out.println("De temperatuur is ongeveer "+this.tempMin+" graden");
        } else {
            System.out.println("Het is minimaal " + this.tempMin + " graden, en maximaal " + this.tempMax + " graden");
        }
    }
}