package com.company.filmstudio;

import java.util.ArrayList;

public class Film {

    private String titel;
    private Scenario scenario;
    private ArrayList<Acteur> acteurs;

    public Film(String titel) {
        this.titel = titel;
        acteurs = new ArrayList<>();
    }

    public void voegActeurToe(Acteur acteur) {
        this.acteurs.add(acteur);
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
    public void print(){
        System.out.println(titel+"\n ----------- \n een film met");
        for (Acteur ac :
                acteurs) {
            ac.print();
        }
        System.out.println("De film duurt " + scenario.berekenTotaleTijd()+"min");
    }
}
