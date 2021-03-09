package com.company.filmstudio;

import java.util.ArrayList;

public class Film {

    private String titel;
    private Scenario scenario;
    private ArrayList<Persoon> personen;
    private int draaidagen;

    public int getDraaidagen() {
        return draaidagen;
    }

    public void setDraaidagen(int draaidagen) {
        this.draaidagen = draaidagen;
    }

    public Film(String titel) {
        this.titel = titel;
        personen = new ArrayList<>();
    }
//    Stay's for backwards compatibility
    public void voegActeurToe(Acteur acteur) {
        this.personen.add(acteur);
    }
    public void voegPersoonToe(Persoon pp) {
        this.personen.add(pp);
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
    public void print(){
        System.out.println(titel+"\n ----------- \n een film met");
        for (Persoon ac :
                personen) {
            ac.print();
        }
        if(scenario != null) {
            System.out.println("De film duurt " + scenario.berekenTotaleTijd() + "min");
        }
    }
    public int loonkosten(){
        int amount = 0;
        for (int i = 0; i < personen.size(); i++) {
           amount += personen.get(i).berekenBeloning(this.draaidagen);
        }
        return amount;
    }
}
