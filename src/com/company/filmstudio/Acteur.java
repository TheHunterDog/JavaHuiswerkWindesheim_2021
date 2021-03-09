package com.company.filmstudio;

public class Acteur extends Persoon{

    private Rol rol;
    private int vastebeloning;

    public Acteur(String naam, Rol rol) {
        this.setNaam(naam);
        this.rol = rol;
    }
    public Acteur(String naam, Rol rol,int vastebeloning) {
        this.setNaam(naam);
        this.rol = rol;
        this.vastebeloning = vastebeloning;
    }

    @Override
    public String toString() {
        return getNaam()+" - " + rol;
    }

    public void print(){
        System.out.println(getNaam()+"Als" + rol);
    }

    @Override
    public double berekenBeloning(int draaidagen) {
        return vastebeloning + (draaidagen * 50);
    }
}
