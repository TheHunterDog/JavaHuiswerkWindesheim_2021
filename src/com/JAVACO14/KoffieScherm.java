package com.JAVACO14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class KoffieScherm extends JFrame implements ActionListener {

    private JButton jbKoffie;
    private JButton jbAnnuleren;
    private Bestelling bestelling;
    private KeuzeDialog KD;

    public KoffieScherm() {
        setTitle("Coffee to go");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        jbKoffie = new JButton("Koffie");
        jbKoffie.addActionListener(this);
        add(jbKoffie);

        jbAnnuleren = new JButton("Annuleren");
        jbAnnuleren.addActionListener(this);
        add(jbAnnuleren);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbAnnuleren) {
            dispose(); //  Applicatie wordt gesloten
        } else {
            int melk = JOptionPane.showConfirmDialog(null, "Wilt u melk", "Keuze 1", JOptionPane.YES_NO_OPTION);
            int suiker = JOptionPane.showConfirmDialog(null, "Wilt u suiker", "Keuze 2", JOptionPane.YES_NO_OPTION);
            KD = new KeuzeDialog(this);

            bestelling = new Bestelling();
            bestelling.setMelk(melk == JOptionPane.YES_OPTION);
            bestelling.setSuiker(suiker == JOptionPane.YES_OPTION);
            bestelling.setSpecialeWensen(KD.isUITWen());

            JOptionPane.showMessageDialog(null,
                    bestelling);
        }
    }
}
