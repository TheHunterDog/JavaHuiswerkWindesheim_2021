package com.company;

public class Taxirit {
    private double prijsPerKm ;
    private int aantalPers;
    private int maxAantal;
    private double afstand;
    private static int aantalritten;

    Taxirit(double afstand){
        this.aantalritten++;
        this.afstand = afstand;
        this.prijsPerKm = 1.25;
    }
    Taxirit(double afstand, int aantalPers, int maxAantal){
        this(afstand);
        this.aantalPers = aantalPers;
        this.maxAantal = maxAantal;
    }
    public int getTotaalAantalRitten(){
        return aantalritten;
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
        double minprijs = 2.50;
        if(maxAantal == aantalPers){
            korting+= 10;
        }
        double prijs = (prijsPerKm * afstand) / 100 * (100-korting);
        if(prijs > minprijs){
            return prijs;
        }
        else{
            return minprijs;
        }
    }
}
