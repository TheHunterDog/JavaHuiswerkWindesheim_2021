package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Weerbericht {
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking =false;
    private boolean neerslag =false;
    private boolean zon =true;
    private LocalDate datum;
    private DateTimeFormatter datumFormat;

    public Weerbericht(double temperatuur, int windkracht, String windrichting){
        this(temperatuur, windkracht, windrichting,false,true,false);

    }
    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean zon, boolean neerslag){
        this.temperatuur = temperatuur;
        this.datum = LocalDate.now();
        this.datumFormat = DateTimeFormatter.ofPattern("eeee");
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        setZon(zon);
        setBewolking(bewolking);
        setNeerslag(neerslag);
    }

    @Override
    public String toString() {
        String additions = "";
        if (neerslag){
            additions+= ", neerslag";
        }
        if (bewolking){
            additions+= ", bewolking";
};
 if (zon){
     additions+= ", zon";


 }
        return getDagVanDeWeek() +" Weerbericht - temperatuur: "+temperatuur+", wind: "+windkracht+" "+windrichting+additions;
    }

    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;

        if(zon == true && bewolking == true){
            System.out.println("We halen de zon weg");
            setZon(false);
        }
        else if(zon == false && bewolking == false){
            System.out.println("We maken de zon");
            setZon(true);
        }
        if(neerslag == true && bewolking == false){
            System.out.println("We halen de regen weg");
            setNeerslag(false);
        }
    }


    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
        if(neerslag) {
            if (!bewolking) {
                System.out.println("We maken het bewolkt");
                setBewolking(true);
            }
            if (zon) {
                System.out.println("We halen de zon weg");
                setZon(false);
            }
        }

    }


    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public double getTemperatuur() {
        return temperatuur;
    }


    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }

    public int getWindkracht() {
        return windkracht;
    }


    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }

    public String getWindrichting() {
        return windrichting;
    }


    public void setZon(boolean zon) {
        this.zon = zon;
        if(bewolking && zon){
            if(neerslag){
                System.out.println("We halen de neerslag weg");
                setNeerslag(false);

            }
            System.out.println("We halen de bewolking weg");
            setBewolking(false);
        }
    }
    public String getDagVanDeWeek(){
        return datumFormat.format(datum);
    }
    public void verhoogDag(){
        this.datum = this.datum.plusDays(1);
    }
    public void verhoogDag(int i){
        this.datum = this.datum.plusDays(i);
    }
}
