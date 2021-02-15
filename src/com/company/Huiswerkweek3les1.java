package com.company;

import com.company.filmstudio.Actie;

import java.util.ArrayList;

public class Huiswerkweek3les1 {
    public static void main(String[] args) {
//        String[] Letterdraad = {"A","B","C","D","E","F"};
//        for (int i = 0; i < Letterdraad.length; i++) {
//            System.out.println(i + 1 +":" +Letterdraad[i]);
//        }
//        int index = 0;
//        for (String letter: Letterdraad) {
//            index++;
//            System.out.println(index +":" +letter);
//
//        }
//        Circus abc = new Circus();
//        abc.printArtiesten();
//
//        abc.setArtiest(4, new Artiest("Jaacom"));
//
//        abc.addAct(new Act("a",122));
//
//        abc.addAct(new Act("a",122));
//        abc.addAct(new Act("a",122));
//        abc.addAct(new Act("a",14333212));
//        abc.printActOverZicht();
//        System.out.println();
//        System.out.println();
//        abc.zoekLangsteAct().printAct();
//        abc.zoekActsMetAantalAriesten(1);
//        Act act = new Act("act 1", 60);
//
//        Artiest artiest1 = new Artiest("artiest 1");
//        act.voegArtiestToe(artiest1);
//
//        Artiest artiest2 = new Artiest("artiest 2");
//        act.voegArtiestToe(artiest2);
//
//        Artiest artiest3 = new Artiest("artiest 3");
//        act.voegArtiestToe(artiest3);
//
//        act.voegArtiestToe(new Artiest("artiest 4"));
//
//        // even kijken hoe de act eruit ziet:
//        System.out.println(act);
//
//
//        Artiest artiest2_copy = new Artiest("artiest 2");
//
//        boolean antwoord = act.wordtUitgevoerdDoor(artiest2_copy);
//        System.out.println("act door " + artiest2_copy + "? " + antwoord); // false
//
//        antwoord = act.wordtUitgevoerdDoor(artiest3);
//        System.out.println("act door " + artiest3 + "? " + antwoord); // true
//
//        Artiest artiest4 = new Artiest("artiest 4");
//        antwoord = act.wordtUitgevoerdDoor(artiest4);
//        System.out.println("act door " + artiest4 + "? " + antwoord); // false
//        Artiest artiest5 = new Artiest("dazn");
//        antwoord = act.wordtUitgevoerdDoor(artiest5);
//        System.out.println("act door " + artiest5 + "? " + antwoord); // false
        ArrayList<String> lijst1 = new ArrayList<String>();
        ArrayList<String> andereLijst = new ArrayList<String>();
// hier de lijsten vullen met objecten
        lijst1.add("bla");
        lijst1.add("iets anders");

        andereLijst.add("iets anders");
        andereLijst.add("bla");

        if (lijst1.equals(andereLijst)) {
            System.out.println("De lijsten zijn gelijk");
        } else {
            System.out.println("De lijsten zijn verschillend");
        }
// enz...



        String[] berichten = new String[]{"Hoi", "Hallo, Hoe gaat het?", "Goed! Met jou ook?", "Goed! Met jou ook?", "Oké tot snel!", "Doei!"};
        System.out.println("Er zijn" +berichten.length + "berichten");
        for (String ber :
                berichten) {
            System.out.println(ber);
        }
//        Bericht[] berichtens = new Bericht[]{new Bericht("Hoi","Piet"),new Bericht("Hallo, Hoe gaat het?","Piet"),new Bericht("Goed! Met jou ook?","Piet"),new Bericht("Goed! Met jou ook?","Piet"),new Bericht("Oké tot snel!","Piet"),new Bericht("Doei!","Piet"),};
//        System.out.println("Er zijn" +berichtens.length + "berichten");
//        for (Bericht ber :
//                berichtens) {
//            System.out.println(ber);
//        }

    }
}
