package JAVACO15.schepijsBasis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BestelGui extends JFrame implements ActionListener {

    private IJsje ijsje;
    private JButton jbAardbei;
    // hier komen de knop-attributen voor de andere smaken en de slagroom
    private JButton Jbanaan;
    private JButton Jframboos;
    private JButton Jsmurfen;
    private JButton Jchocola;
    private JButton Jslagroom;

    public BestelGui() {
        setLayout(new FlowLayout());
        setSize(530, 820);
        ijsje = new IJsje();
        Jchocola = new JButton();
        Jbanaan = new JButton();
        Jframboos = new JButton();
        Jsmurfen = new JButton();
        jbAardbei = new JButton();
        Jslagroom = new JButton();

        jbAardbei.setText("Aardbei");
        Jbanaan.setText("Banaan");
        Jframboos.setText("Framboos");
        Jsmurfen.setText("Smurfen");
        Jchocola.setText("Chocola");
        Jslagroom.setText("Salgroom");

        Jbanaan.addActionListener(this);
        Jframboos.addActionListener(this);
        Jsmurfen.addActionListener(this);
        Jchocola.addActionListener(this);
        jbAardbei.addActionListener(this);
        Jslagroom.addActionListener(this);

        SchepijsPanel panel = new SchepijsPanel(ijsje);
        add(panel);
        add(Jbanaan);
        add(Jframboos);
        add(Jsmurfen);
        add(Jchocola);
        add(jbAardbei);
        add(Jslagroom);

        // initialiseer hier de knoppen (met ActionListener!) en voeg ze toe

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbAardbei) {
            ijsje.voegSmaakToe(Color.RED);
        }
        if (e.getSource() == Jbanaan) {
            ijsje.voegSmaakToe(Color.yellow);
        }
        if (e.getSource() == Jchocola) {
            ijsje.voegSmaakToe(new Color(100,50,0));
        }
        if (e.getSource() == Jframboos) {
            ijsje.voegSmaakToe(new Color(250,25,25 ));
        }
        if (e.getSource() == Jsmurfen) {
            ijsje.voegSmaakToe(Color.BLUE);
        }
        if (e.getSource() == Jslagroom) {
            ijsje.metSlagroom();
        }


        // hier komen de andere smaken, en de slagroom
        repaint();
    }
}
