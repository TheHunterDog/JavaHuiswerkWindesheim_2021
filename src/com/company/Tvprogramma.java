package com.company;

public class Tvprogramma {
    private String title;
    private int tijdsduur;
    private Zender uitgezondenop;
    private int afleveringnummer;

    public Tvprogramma(String title, int tijdsduur, Zender uitgezondenop, int afleveringnummer) {
        this.title = title;
        this.tijdsduur = tijdsduur;
        this.uitgezondenop = uitgezondenop;
        this.afleveringnummer = afleveringnummer;
    }

    public String getTitle() {
        return title;
    }

    public int getTijdsduur() {
        return tijdsduur;
    }

    public Zender getUitgezondenop() {
        return uitgezondenop;
    }

    public int getAfleveringnummer() {
        return afleveringnummer;
    }

    public String toString() {
        return "Tvprogramma{\n" +
                "title='" + title + '\'' +
                ", tijdsduur=" + tijdsduur +
                ", uitgezondenop=" + uitgezondenop +
                ", afleveringnummer=" + afleveringnummer +
                "}";
    }
}
