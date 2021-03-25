package JAVACO15;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {
    private HuisPanel pan;
    public Screen() {
        setSize(new Dimension(500, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pan = new HuisPanel();
        add(pan);
        pan.repaint();
        setVisible(true);
    }
}
