package com.filmbasis;

import java.util.ArrayList;

public class Scenario {

    private ArrayList<Scene> scenes;

    public Scenario() {
        scenes = new ArrayList<>();
    }

    public void voegSceneToe(Scene scene) {
        scenes.add(scene);
    }
    public int getAantalScenes(){
        return scenes.size();
    }

}
