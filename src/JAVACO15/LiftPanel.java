package JAVACO15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiftPanel extends JFrame implements ActionListener {
    LiftCanvas lc;
    JButton up;
    JButton down;
    public LiftPanel() {
        setSize(new Dimension(500, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        lc = new LiftCanvas();
        up = new JButton();
        down = new JButton();

        up.setText("Omhoog");
        down.setText("Omlaag");

        up.addActionListener(this);
        down.addActionListener(this);

        add(up);
        add(down);
        add(lc);

        lc.repaint();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == up){
            lc.up();
        }
        if(e.getSource() == down){
            lc.down();
        }
        repaint();

    }
}
