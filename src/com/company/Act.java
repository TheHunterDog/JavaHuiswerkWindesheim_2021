package com.company;

import java.util.ArrayList;

public class Act {
    private String naam;
    private int tijdsduur;
    private ArrayList<Artiest> artiesten = new ArrayList<>();
    public Act(String naam, int tijdsduur){
        this.naam = naam;
        this.tijdsduur = tijdsduur;
    }
    public void voegArtiestToe(Artiest artiest){
        artiesten.add(artiest);
    }
    public void printAct(){
        System.out.println("De Act wordt gedaan door");
        for (Artiest art:
             artiesten) {
            System.out.println(art);

        }
        System.out.println("Duurt " + tijdsduur);
    }

    @Override
    public String toString() {
        return "Act{" +
                "naam='" + naam + '\'' +
                ", tijdsduur=" + tijdsduur +
                ", artiesten=" + artiesten +
                '}';
    }

    public int getAantalArtiesten(){
        return artiesten.size();
    }

    public int getTijdsduur() {
        return tijdsduur;
    }
    public boolean wordtUitgevoerdDoor(Artiest artiest){
        if(artiesten.contains(artiest)){
            return true;
        }
        return false;
    }
}
