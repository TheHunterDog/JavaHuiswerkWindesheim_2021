package com.company;

import com.company.tv.Tvgids;
import com.company.tv.Tvprogramma;

import java.util.ArrayList;
import java.util.Random;

public class Huiswerkweek3les2 {
    public static void main(String[] args) {
        String[] words = new String[]{"WandaVision","Capitani","Lucifer","The 100","Vikings","Lupin","Crime Scene: The Vanishing at the Cecil Hotel"};
        ArrayList<Tvprogramma> programs = new ArrayList<>();
        Random rand = new Random();
        while (programs.size() < 1000){
            Bedrijf andersco = new Bedrijf(words[rand.nextInt(words.length -1)],rand.nextInt(30000));
            Zender RegionaalAnders = new Zender(words[rand.nextInt(words.length -1)],rand.nextInt(1000),andersco);
//            Tvprogramma program = new Tvprogramma(words[rand.nextInt(words.length -1)],rand.nextInt(500),RegionaalAnders, rand.nextInt(10000));
//            programs.add(program);
        }
        Tvgids tvgids = new Tvgids(programs);
        System.out.println(tvgids);
    }
}
