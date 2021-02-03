package com.company;

public class Huiswerkweek3 {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
//        System.out.println(auto1);

        auto1.setMerk("skoda");
        auto1.setType("Fabia");
        auto1.setPk(60);
        System.out.println(auto1);

        Auto auto2 = new Auto();
        auto2.setMerk("Tesla");
        auto2.setType("S");
        auto2.setPk(400);
        System.out.println(auto2);
        auto1.voerOp(400);

    }
}