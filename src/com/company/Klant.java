package com.company;

public class Klant extends Persoon{
    private double budget;
    public Klant(String naam, int lengte, int leeftijd, double budget) {
        super(naam, lengte, leeftijd);
        this.budget = budget;
    }
    public void verhoogBudget(double bedrag){
        this.budget = bedrag;
    }
}
