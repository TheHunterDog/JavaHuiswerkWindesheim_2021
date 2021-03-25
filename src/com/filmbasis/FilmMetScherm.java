package com.filmbasis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FilmMetScherm extends JFrame implements ActionListener {
    private Film film;
    private JLabel len;
    private JButton ad;
    private DialogC dia;
    public FilmMetScherm (Film f){
        film = f;
        setTitle(f.getTitel());
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        len = new JLabel("Aantal scenes: " + f.getTotaalaantalScenes());
        add(len);
        ad = new JButton("Scene toevoegen");
        ad.addActionListener(this);
        add(ad);
        setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ad){
            dia = new DialogC(this);
            if(dia.getJtpBeschrijving() != null && dia.getJtptijd() != 0){
                film.getScenario().voegSceneToe(new Scene(dia.getJtpBeschrijving(),dia.getJtptijd()));
                len.setText("Aantal scenes: " + film.getTotaalaantalScenes());
            }else{
                JOptionPane.showMessageDialog(new JFrame(), "NO VALUES", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
