package JAVACO15;

import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    public Draw(){
        setPreferredSize(new Dimension(400,300));
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.gray);
        Dimension d = this.getSize();
        g.setColor(Color.orange);
        g.drawLine(d.width,0,0,d.height);
        g.drawLine(0,0,d.width,d.height);
        g.setColor(Color.BLACK);
        g.drawOval(19,100,101,101);
        g.setColor(Color.red);
        g.fillOval(20,100,100,100);
    }
}
