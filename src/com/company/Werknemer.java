package com.company;

public class Werknemer extends Persoon{
    private double salaris;
    private String rol;
    private Bedrijf werktbij;
    public Werknemer(String naam, int lengte, int leeftijd,double salaris) {
        super(naam, lengte, leeftijd);
        this.salaris = salaris;
    }
    public void verhoogSalaris(double bedrag){
        this.salaris = bedrag;
    }

    public double getSalaris() {
        return salaris;
    }

    public String getRol() {
        return rol;
    }

    public Bedrijf getWerktbij() {
        return werktbij;
    }

    public String toString() {
        return "Werknemer{" +
                "salaris=" + salaris +
                ", rol='" + rol + '\'' +
                ", werktbij=" + werktbij +
                '}';
    }
}
