package com.JAVACO14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeuzeDialog extends JDialog implements ActionListener {

    private JButton jbJ;
    private JButton jbN;
    private JLabel SpWen;
    private JTextPane UITWen;
    private boolean Ans;

    public KeuzeDialog(JFrame frame) {
        super(frame, true);
        setSize(300, 150);
        setLayout(new FlowLayout());
        SpWen = new JLabel("Speciale wensen");
        add(SpWen);
        UITWen = new JTextPane();
        add(UITWen);
        jbJ = new JButton("Yes");
        jbJ.addActionListener(this);
        add(jbJ);
        jbN = new JButton("No");
        jbN.addActionListener(this);
        add(jbN);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbJ){
            Ans = true;
        }
        else{
            Ans = false;
        }
        setVisible(false);
    }

    public String isUITWen() {
        return UITWen.getText();
    }
}
