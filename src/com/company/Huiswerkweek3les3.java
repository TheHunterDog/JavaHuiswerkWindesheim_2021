package com.company;


import com.company.berichten.InformeelBericht;

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


        
    }
}
