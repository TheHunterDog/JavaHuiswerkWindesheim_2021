package JAVACO15;

import javax.swing.*;
import java.awt.*;

public class LiftCanvas extends JPanel {
    private int x;
    private int y;
    public LiftCanvas(){
        setPreferredSize(new Dimension(400,300));

    }
    public void paintComponent(Graphics g){
        Dimension d = this.getSize();
        super.paintComponent(g);
        setBackground(Color.gray);
        g.fillRect(0,y,20,30);
        g.setColor(Color.red);
        g.drawLine(0,0,0,d.height);
        g.drawLine(0,d.height-1,d.width,d.height -1);
    }

    public void up(){
        y-= 50;
    }
    public void down(){
        y+= 50;

    }


}
