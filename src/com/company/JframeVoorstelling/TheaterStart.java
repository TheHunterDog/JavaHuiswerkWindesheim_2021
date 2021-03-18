package com.company.JframeVoorstelling;

import javax.swing.JFrame;

public class TheaterStart {

    public static void main(String[] args) {
        Voorstelling voorstelling = new Voorstelling("de Vuurtoren", 10);
        Scherm voorstellinGUI = new Scherm(voorstelling);
        voorstellinGUI.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );
    }
}
