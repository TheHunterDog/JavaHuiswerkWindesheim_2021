package com.company;

public class Huiswerkweek4les1 {
    public static void main(String[] args) {
        ReisPersoon persoon1 = new ReisPersoon(new Paspoort("Hannie", "44320098"));
        ReisPersoon persoon2 = new ReisPersoon(new Identiteitskaart("Jennie", "44320098"));
        ReisPersoon persoon3 = new ReisPersoon(new Rijbewijs("Tonnie", "44320098", "BE"));

        System.out.println(persoon1);
        System.out.println(persoon2);
        System.out.println(persoon3);
        persoon1.toonOverzicht();

    }
}
