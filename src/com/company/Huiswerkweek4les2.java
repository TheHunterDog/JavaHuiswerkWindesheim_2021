package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Huiswerkweek4les2 {

    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("C:/bestandsnaam.txt");
            String[] namen = new String[]{"Michiel", "Amy", "Joost"};
            for (int i = 0; i < 4; i++) {
                writer.println(namen[i]);
            }

            writer.println("hoofdstuk 1");
            writer.close();

        }
        catch (FileNotFoundException e){
            System.out.println("Bestand kan niet gemaakt worden:");
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Er is iets mis gegaan");
            System.out.println(e.getMessage());
        }
        finally {
            writer.close();

        }


    }
}
