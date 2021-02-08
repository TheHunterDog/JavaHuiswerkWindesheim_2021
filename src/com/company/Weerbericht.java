package com.company;

public class Weerbericht {
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking =false;
    private boolean neerslag =false;
    private boolean zon =true;
    public Weerbericht(double temperatuur, int windkracht, String windrichting){
        this(temperatuur, windkracht, windrichting,false,true,false);

    }
    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean zon, boolean neerslag){
        this.temperatuur = temperatuur;
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
        return "Weerbericht - temperatuur: "+temperatuur+", wind: "+windkracht+" "+windrichting+additions;
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
}
