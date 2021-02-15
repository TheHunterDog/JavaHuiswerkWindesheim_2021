package com.company.filmstudio;

public class Actie {

    private Rol rol;
    private String gedrag;
    private String tekst;

    public Actie(Rol rol, String tekst) {
        this.rol = rol;
        this.tekst = tekst;
    }

    public Actie(Rol rol, String tekst, String gedrag) {
        this.rol = rol;
        this.tekst = tekst;
        this.gedrag = gedrag;
    }
    public void print(){
        System.out.println(rol +gedrag+" : " + tekst);
    }

    public String getGedrag() {
        return gedrag;
    }

    public Rol getRol() {
        return rol;
    }
}
