package JAVACO15.schepijsBasis;

import java.awt.Color;
import java.util.ArrayList;

public class IJsje {

    private ArrayList<Color> smaken;
    private boolean slagroom;

    public IJsje() {
        smaken = new ArrayList<Color>();
    }

    public void voegSmaakToe(Color smaak) {
        if (slagroom) {
            System.out.println("Je hebt al slagroom");
        } else {
            smaken.add(smaak);
        }
    }

    public void metSlagroom() {
        if (smaken.size() == 0) {
            System.out.println("Kies eerst een ijssmaak");
        } else {
            slagroom = true;
        }
    }

    public ArrayList<Color> getSmaken() {
        return smaken;
    }

    public boolean heeftSlagroom() {
        return slagroom;
    }
}
