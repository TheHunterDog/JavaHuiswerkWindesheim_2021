package com.company.filmstudio;

import java.util.ArrayList;

public class Scenario {

    private ArrayList<Scene> scenes;

    public Scenario() {
        scenes = new ArrayList<>();
    }

    public void voegSceneToe(Scene scene) {
        scenes.add(scene);
    }
    public void print(){
        int i = 0;
        for (Scene scene:
             scenes) {
            i++;
            System.out.println("SCENE " + i);
            scene.print();
        }
    }
    public int berekenTotaleTijd(){
        int tijd = 0;
        for (Scene scene :
                scenes) {
            tijd += scene.getTijd();
        }
        return tijd;
    }
    public int telAantalActies(){
        int count = 0;
        for (Scene secen :
                scenes) {
            count += secen.telAantalActies();
        }
        return count;
    }
    public int telAantalActiesMetGedrag(){
        int count = 0;
        for (Scene secen :
                scenes) {
            count += secen.telAantalActiesMetGedrag();
        }
        return count;
    }
    public Scene zoekLangsteScene(){
        Scene mem = scenes.get(0);
        for (Scene secen :
                scenes) {
            if(mem.getTijd() < secen.getTijd()){
                mem = secen;
            }
        }
        return mem;

    }
    public Scene zoekSceneMetMeesteActies(){
        Scene mem = scenes.get(0);
        for (Scene secen :
                scenes) {
            if(mem.telAantalActies() < secen.telAantalActies()){
                mem = secen;
            }
        }
        return mem;

    }
}
