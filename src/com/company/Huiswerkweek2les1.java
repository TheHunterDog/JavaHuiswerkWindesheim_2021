package com.company;

public class Huiswerkweek2les1 {
    public static void main(String[] args) {
        Fabriek fab = new Fabriek();
        Auto Shit = fab.maakAuto("Ferrari","P80/C",592);
        System.out.println(Shit);
        Hemellichaam hl1 = new Hemellichaam("Mercurius", "planeet");
        System.out.println("naam: " + hl1.getNaam());
        System.out.println("type: " + hl1.getType());
        System.out.println(hl1);
        Hemellichaam hl2 = new Hemellichaam("PSO J318.5-22");
        System.out.println(hl2);


        Hemellichaam hl3 = new Hemellichaam("Pluto", "planeet");
        System.out.println(hl3);
        hl3.setType("dwergplaneet");
        System.out.println(hl3);



        Hemellichaam hl4 = new Hemellichaam("Aarde", "planeet");
        hl4.setTemperatuur(-89, 58);
        hl4.printTemperatuur();


        Hemellichaam hl5 = new Hemellichaam("Antares", "ster");
        hl5.setTemperatuur(3204);
        hl5.printTemperatuur();



        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());



        System.out.println(weerbericht);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.setNeerslag(true);
        System.out.println(weerbericht);


        // geen bewolking, wel neerslag, geen zon: dat kan niet,
// dus geen bewolking? dan ook geen neerslag en wel zon
        Weerbericht weerbericht3 = new Weerbericht(4.0, 9, "NO", false, false, true);
        System.out.println(weerbericht3);
// geen wolken? dan dus ook geen neerslag en wel zon
        weerbericht3.setBewolking(false);
        System.out.println(weerbericht3);


        Taxirit tax = new Taxirit(15,15161,516165165);
        System.out.println(tax.berekenPrijsPerPersoon());
        tax.voegPersoonToe(181881);
    }
}
