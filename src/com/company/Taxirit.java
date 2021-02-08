package com.company;

public class Taxirit {
    private double prijsPerKm ;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    Taxirit(double afstand){
        this.afstand = afstand;
        this.prijsPerKm = 1.25;
    }
    Taxirit(double afstand, int aantalPers, int maxAantal){
        this(afstand);
        this.aantalPers = aantalPers;
        this.maxAantal = maxAantal;
    }
    public void voegPersoonToe(int personen){
        if(maxAantal <= (aantalPers+personen)){
            System.out.println("We zitten vol");
            System.out.println("We nemen er " + (personen - (maxAantal-aantalPers) +" Niet mee"));
            aantalPers = maxAantal;

        }
        else{
            aantalPers+= personen;
        }

    }
    public double berekenPrijsPerPersoon(){
        int korting = 0;
        if(maxAantal == aantalPers){
            korting+= 10;
        }
        return (prijsPerKm * afstand) / 100 * (100-korting);
    }
}
