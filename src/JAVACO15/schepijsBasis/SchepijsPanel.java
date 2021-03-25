package JAVACO15.schepijsBasis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class SchepijsPanel extends JPanel {

    private IJsje ijsje;
    private int bolGrootte = 180, x = 170, yStart = 415;
    private BufferedImage hoorntje, slagroom;

    public SchepijsPanel(IJsje ijsje) {
        this.ijsje = ijsje;
        this.setPreferredSize(new Dimension(500, 700));
        try {
            hoorntje = ImageIO.read(new File("src/JAVACO15/schepijsBasis/hoorntje.jpg"));
            slagroom = ImageIO.read(new File("src/JAVACO15/schepijsBasis/slagroom.png"));
        } catch (IOException ex) {
            System.out.println("Plaatje niet gevonden.");
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.white);
        g.drawImage(hoorntje, 140, 450, null);
        int y = yStart;
        for (Color smaak : ijsje.getSmaken()) {
            g.setColor(smaak);
            g.fillOval(x,y,bolGrootte,bolGrootte);
            y -= (bolGrootte - 100);
        }
        if(ijsje.heeftSlagroom()){
            g.drawImage(slagroom, (x - (slagroom.getWidth() / 8)), y, null);
        }
        // toon hier het slagroomplaatje zoals het hoorntje hierboven
    }
}
