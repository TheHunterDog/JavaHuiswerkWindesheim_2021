package com.company;

import java.util.ArrayList;

public class Circus {
    private String naam;
    private Artiest[] artiesten = new Artiest[5];
    private ArrayList<Act> acts = new ArrayList<>();

    public Circus(){
        this.naam = "Van erst";

        this.artiesten[0] =  new Artiest("Alfred");
        this.artiesten[1] =  new Artiest("Cornel");
        this.artiesten[2] =  new Artiest("Ernst");
        this.artiesten[3] =  new Artiest("Bobbie");
        this.artiesten[4] =  new Artiest("Eduart");
    }

    public Circus(String naam, Artiest[] artiesten ){
        this.naam = naam;
        int i = 0;
        this.artiesten = artiesten;
    }
    public void printArtiesten(){
        int i = 0;
        System.out.println("Circus" + this.naam + "Heeft de volgende artiesten:");
        for (Artiest artie:
             this.artiesten) {

            System.out.println("* artiest nr."+(i + 1)+"="+artie);
            i++;
        }
    }
    public int getAantalArtiesten(){
        return artiesten.length;
    }
    public void setArtiest(int index, Artiest artiest){
        if(index > artiesten.length) {
            artiesten[index] = artiest;
        }
    }
    public void addAct(Act act){
        acts.add(act);
    }
    public void printActOverZicht(){
        for (Act act:
             this.acts) {
            act.printAct();
        }
    }
    public Artiest GetArtiest(int index){
        return artiesten[index];
    }
    public Act zoekLangsteAct() {
        Act mem = acts.get(0);
        for (Act act :
                acts) {
            if (mem.getTijdsduur() < act.getTijdsduur()) {
                mem = act;
            }

        }
        return mem;
    }
    public ArrayList<Act> zoekActsMetAantalAriesten(int aantal){
        ArrayList<Act> mem = new ArrayList<>();
        for (Act act:
             this.acts) {
            if(act.getAantalArtiesten() == aantal){
                mem.add(act);
            }
        }
        return mem;
    }
}
