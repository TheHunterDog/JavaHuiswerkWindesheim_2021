package com.company.filmstudio;

public class Acteur {

    private String naam;
    private Rol rol;

    public Acteur(String naam, Rol rol) {
        this.naam = naam;
        this.rol = rol;
    }
    public void print(){
        System.out.println(naam+"Als" + rol);
    }
}
