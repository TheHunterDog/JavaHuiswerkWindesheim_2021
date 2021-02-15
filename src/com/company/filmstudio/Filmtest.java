package com.company.filmstudio;

public class Filmtest {

    public static void main(String[] args) {

        Film film = new Film("Een korte ontmoeting");

        Rol mevrouwDeKort = new Rol("Mevrouw de Kort", "vriendelijke mevrouw");
        Rol meneerVanLoon = new Rol("Meneer van Loon", "vriendelijke meneer");
        Rol conducteur = new Rol("Conducteur", "norse conducteur");

        Acteur dWinterland = new Acteur("Dagmar Winterland", mevrouwDeKort);
        Acteur hDrissi = new Acteur("Haroen Drissi", meneerVanLoon);
        Acteur hGerards = new Acteur("Hubert Gerards", conducteur);

        film.voegActeurToe(dWinterland);
        film.voegActeurToe(hDrissi);
        film.voegActeurToe(hGerards);

        Scenario scenario = new Scenario();

        Scene scene1 = new Scene("Op het perron", 3);
        scene1.voegActieToe(mevrouwDeKort, "Pardon, U staat op mijn tas");
        scene1.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scenario.voegSceneToe(scene1);

        Scene scene2 = new Scene("In de trein", 4);
        scene2.voegActieToe(conducteur, "Goedemorgen, vervoersbewijzen alstublieft");
        scene2.voegActieToe(meneerVanLoon, "Goedemorgen", "laat ov-kaart zien");
        scene2.voegActieToe(mevrouwDeKort, "Moment alstublieft", "zoekt haar tas");
        scene2.voegActieToe(conducteur, "Vervoersbewijs altublieft", "wordt ongeduldig");
        scene2.voegActieToe(meneerVanLoon, "Wat bent u ongeduldig");
        scene2.voegActieToe(mevrouwDeKort, "Ik ben mijn tas kwijt conducteur");
        scene2.voegActieToe(mevrouwDeKort, "Pardon meneer, U zit op mijn tas", "kijkt naar meneer van Loon");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien", "schrikt");
        scene2.voegActieToe(mevrouwDeKort, "Alstublieft", "haalt kaart tevoorschijn");
        scene2.voegActieToe(conducteur, "Dank u, prettige reis");
        scene2.voegActieToe(mevrouwDeKort, "Wat heeft u toch met mijn tas meneer?");
        scene2.voegActieToe(meneerVanLoon, "Ach ik had het niet gezien, ik ben mijn bril vergeten", "lacht");
        scenario.voegSceneToe(scene2);

        film.setScenario(scenario);
        scenario.print();
    }
}
