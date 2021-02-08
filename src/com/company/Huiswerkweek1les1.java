package com.company;

import java.util.Locale;

public class Huiswerkweek1les1 {

    public static void main(String[] args) {

// Opdracht 1 A
        System.out.println("Hello World");
//Opdracht 1 B
//		Een int kan geen string zijn bij X
//		variabel y heeft geen type
//		Z is correct
//Opdracht 1 C mondeling uitleggen
//        Opdracht 1 D
        int x = 42;
        System.out.println(x);
        // nog meer ...

        if( x == 42 )
        {
            System.out.println("x is 42");
            int yy = x + 1;
            System.out.println("het getal erna is: " + yy);

            if( yy == 43 )
            {
                String zzz = "het getal erna is inderdaad " + yy;
                System.out.println(zzz);
            }
            x++;
        }
        else
        {
            System.out.println("huh? x is geen 42 !");
            int yy = x + 1;
            System.out.println("het getal erna is: " + yy);
        }
//        Opgave 2 A
int C = 0;
while (C < 8) {

    for (int i = 0; i < 8; i++) {
        System.out.print("*");
    }
    System.out.println();
    C++;
}
        System.out.println();
//Opgave 2 B
DrawVierkant(20 ,20,"*");
        System.out.println();
//Opgave 2 C
        DrawVierkant(20,8,"*");
        System.out.println();
        //Opgave 2 D

        DrawDriehoek(1,8);
        System.out.println();
        //Opgave 2 E
        DrawWhileDrieHoek(1,20);
        System.out.println();
        //Opgave 2 F

        DrawWhileDrieHoek(1,20);
        System.out.println();
        //Opgave 2 F

        DrawDriehoek(8,1);
        System.out.println();
//Opgave 2 G

        DrawDriehoek(20,1);
        System.out.println();
        //Opgave 2 H

        DrawDriehoek(1,5);
        DrawDriehoek(4,1);
        //Opgave 3 A


        final String chad = "Mark";
        System.out.println(chad + " is "+ chad.length() + " lang!!111§1!!!");
        //Opgave 3 B

        final String notChad= "Ruben";
//        kan beter VVVV
        if (chad.length() > notChad.length()) {
            System.out.println(chad +" is langer dan " + notChad );
        }
        else{
            System.out.println(notChad +" is langer dan " + chad );

        }
        //Opgave 3 C D E

        String b = "aaaaaaaa";
        String a = "a";
        while(a.length() < b.length()) {
            a = a + a;
            if((a.length() + 1) % 5 != 0) {
                a = a.toUpperCase();
            }
            else{
                a = a.toLowerCase();
            }
                System.out.println(a +" "+ a.length());

        }
        //Opgave 3 F

final int AantalVogels = 15;
        System.out.println("Ik zie "+ AantalVogels + (AantalVogels < 1 ? " vogel " : " vogels "));

    }
    public static void DrawVierkant(int x,int y,String print){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(print);
            }
            System.out.println();

        }
    }

    public static void DrawDriehoek(int start, int end) {
        start--;
        end--;
        if(start < end) {
            for (int i = start; i <= end; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }

                    System.out.println();

            }
        }else{
            for (int i = start; i >= end; i--) {
                for (int j = 0; j <= i ; j++) {
                    System.out.print("*");
                }
                    System.out.println();
            }
        }
    }
    public static void DrawWhileDrieHoek(int start, int end){
        int i = start - 1;
        int j = 0;
        while(i < end){
            j = 0;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
