package JAVACO15;

import javax.swing.*;
import java.awt.*;

public class Scherm extends JFrame {
    private Draw draw;
    public Scherm(){

        setSize(new Dimension(500,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw = new Draw();
        add(draw);
        draw.repaint();
        setVisible(true);
    }

}
