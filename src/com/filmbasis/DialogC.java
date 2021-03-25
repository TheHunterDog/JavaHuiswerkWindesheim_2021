package com.filmbasis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogC extends JDialog implements ActionListener {
    private JButton jbJ;
    private JButton jbN;
    private JLabel jlBeschrijving;
    private JTextPane jtpBeschrijving;
    private JLabel jlTijd;
    private JTextPane jtptijd;
    private boolean ans;
    public DialogC(JFrame frame) {
        super(frame, true);
        setSize(300, 150);
        setLayout(new FlowLayout());
        jlTijd = new JLabel("Hoelaat is de scene");
        add(jlTijd);
        jtptijd = new JTextPane();
        add(jtptijd);
        jlBeschrijving = new JLabel("Beschrijving:");
        add(jlBeschrijving);
        jtpBeschrijving = new JTextPane();
        add(jtpBeschrijving);
        jbJ = new JButton("OK");
        jbJ.addActionListener(this);
        add(jbJ);
        jbN = new JButton("Anuleren");
        jbN.addActionListener(this);
        add(jbN);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbJ){
            ans = true;
        }
        else{
            ans = true;
        }
        setVisible(false);
    }

    public String getJtpBeschrijving() {
        return jtpBeschrijving.getText();
    }

    public int getJtptijd() {
        try {
            return Integer.parseInt(jtptijd.getText());
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
}
