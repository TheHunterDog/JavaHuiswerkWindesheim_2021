package JAVACO15;

import javax.swing.*;
import java.awt.*;

public class HuisPanel extends JPanel {
    public HuisPanel(){
        setPreferredSize(new Dimension(500,500));
    }
    public void paintComponent(Graphics g){
        Dimension d = this.getSize();
        g.setColor(Color.red);
//wall
        g.drawLine(d.width/4 ,d.height/2,d.width/4,d.height);
        g.drawLine(d.width/4* 3,d.height/2,d.width/4*3,d.height);
//      foundation
        g.drawLine(0,d.height-5,d.width,d.height-5);
//        roof
        g.drawLine(d.width/2,50,d.width/4*3,d.height/2);
        g.drawLine(d.width/2,50,d.width/4,d.height/2);
        g.drawOval(50,50,100,100);
//        window
        g.drawRect(d.width/4*2,d.height/6*3,50,60);
//        door
        g.drawRect(d.width/4 + 20,d.height/6*5,50,90);
        g.fillRect(d.width/4 + 20+3,d.height/6*5 + 5,50 - 5,90-10);

    }
}
