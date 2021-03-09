package com.company;


import com.company.berichten.InformeelBericht;
import com.company.filmstudio.Film;
import com.company.filmstudio.Medewerker;
import com.company.filmstudio.Persoon;

import java.util.ArrayList;
import java.util.Random;

public class Huiswerkweek3les3 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] words = new String[]{"bedankt ","dank ","bloemen ","met ","hond ","kat ","aap ","en ","computer ","Paard ","Manage ","Speakers ","Werken ","PLUS DE GREEF ","gang ","wil ","je ","warzone ","spelen ","COVID-19 ","corona ","Lockdown ","quarantine ","saai ","java ","leuk ","C++ ","rust "};
        String sentance = new String();
        for (int i = 0; i < rand.nextInt(2); i++) {
            sentance += words[rand.nextInt(words.length - 1)];
        }
        new InformeelBericht("Max","aap","Man",sentance).printBericht();

        Film film = new Film("ABCD");
        film.voegPersoonToe(new Medewerker("Directeur","Alfred Robertsen","1999-02-22",true,213));
        film.voegPersoonToe(new Medewerker("Dino","Bjourne","1999-02-22",true,123));
        film.voegPersoonToe(new Medewerker("Doktor","aard","1999-02-22",true,51635654));
        film.voegPersoonToe(new Medewerker("Aaap","Eduart","1999-02-22",true,51635654));
        film.voegPersoonToe(new Medewerker("Aaap","Joey","1999-02-22",true,51635654));
        film.voegPersoonToe(new Medewerker("Aaap","Milos","1999-02-22",true,51635654));
        film.voegPersoonToe(new Medewerker("Aaap","Robin","1999-02-22",true,51635654));
        film.voegPersoonToe(new Medewerker("Aaap","Jurgen","1999-02-22",true,51635654));
        film.print();
        film.setDraaidagen(546);
//        Amount is too high that why it flips
        System.out.println("De loon kosten zijn:"+film.loonkosten());

        
    }
}
