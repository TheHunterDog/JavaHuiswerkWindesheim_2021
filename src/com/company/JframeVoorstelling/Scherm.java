package com.company.JframeVoorstelling;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Scherm extends JFrame {

    private Voorstelling voorstelling;
    private JLabel jlAantalPlaatsen;

    private JTextField jtAantalVerkopen;
    private JTextField jtAantalAnnuleren;

    public Scherm(Voorstelling voorstelling) {
        this.voorstelling = voorstelling;

        setTitle("Voorstelling " + voorstelling.getNaam());
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        add(new JLabel("aantal plaatsen vrij:"));
        String aantalPlaatsen = String.valueOf(voorstelling.getAantalPlaatsen());
        jlAantalPlaatsen = new JLabel(aantalPlaatsen);
        add(jlAantalPlaatsen);

        setVisible(true);
    }
}
