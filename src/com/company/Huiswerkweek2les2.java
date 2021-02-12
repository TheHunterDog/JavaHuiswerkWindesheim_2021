package com.company;

import java.util.Scanner;

public class Huiswerkweek2les2 {
    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(1,1,"NO");
        System.out.println(weerbericht);
        weerbericht.verhoogDag();
        System.out.println(weerbericht);
        weerbericht.verhoogDag(2);
        System.out.println(weerbericht);



        String x = "Ja";
        String y = "va";
        String z = "Java";
        String xeny = x + y;

        if (xeny == z) {
            System.out.println("Ze zijn gelijk");
        } else {
            System.out.println("Ze zijn niet gelijk");
        }
        String tekst1 = "Java";
        String tekstTwee = new String("Java");

        if (tekst1 == tekstTwee) {
            System.out.println("Ze zijn gelijk");
        } else {
            System.out.println("Ze zijn niet gelijk");
        }
        String teVergelijkenMet = "Java";

        Scanner in = new Scanner(System.in);
        System.out. println(
                "input (te vergelijken met: \"" + teVergelijkenMet + "\" :");

        String gebruikerInput = in. nextLine();
        System.out. println("je input was: \"" + gebruikerInput + "\"");

        System.out.println("De vergelijking is"+ gebruikerInput.equals(teVergelijkenMet));

    }
}
