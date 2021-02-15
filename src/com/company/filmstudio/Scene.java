package com.company.filmstudio;

import java.util.ArrayList;

public class Scene {

    private String beschrijving;
    private ArrayList<Actie> acties;
    private int tijd;

    public Scene(String beschrijving, int tijd) {
        this.beschrijving = beschrijving;
        this.tijd = tijd;
        acties = new ArrayList<>();
    }

    public void voegActieToe(Rol rol, String tekst) {
        Actie actie = new Actie(rol, tekst);
        acties.add(actie);
    }

    public void voegActieToe(Rol rol, String tekst, String gedrag) {
        Actie actie = new Actie(rol, tekst, gedrag);
        acties.add(actie);
    }
    public void print(){
        System.out.println("---"+ beschrijving +"("+tijd+"Min.)"+"---");
    }

    public int getTijd() {
        return tijd;
    }
    public int telAantalActies(){
        return acties.size();
    }
    public int telAantalActiesMetGedrag(){
        int co = 0;
        for (Actie actie :
                acties) {
            if(actie.getGedrag() != null){
                co++;
            }
        }
        return co;
    }
    public int telAantalActiesVanRol(Rol rol){
        int co = 0;
        for (Actie actie :
                acties) {
            if(actie.getRol() == rol){
                co++;
            }
        }
        return co;
    }
   public int telAantalActiesVanRolMetGedrag(Rol rol){

       int co = 0;
       for (Actie actie :
               acties) {
           if(actie.getGedrag() != null && actie.getRol() == rol){
               co++;
           }
       }
       return co;
   }
}
