package com.company;

public class Persoon {
    private String naam;
    private int lengte;
    private int leeftijd;

    public Persoon(String naam,int lengte, int leeftijd){
        this.naam = naam;
        this.lengte = lengte;
        this.leeftijd = leeftijd;
    }
    public String getNaam(){
        return naam;
    }

    public int getLengte(){
        return lengte;
    }

    public String toString() {
        return "Dit is "+ naam+", leeftijd "+leeftijd;
    }
    public void jarig(){
        this.leeftijd+=1;
    }
}
