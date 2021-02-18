package com.company.tv;

import java.util.ArrayList;

public class Tvgids {
    private ArrayList<Tvprogramma> tvprogrammas = new ArrayList<>();

    public Tvgids(ArrayList<Tvprogramma> tvprogrammas) {
        this.tvprogrammas = tvprogrammas;
    }

    public ArrayList<Tvprogramma> getTvprogrammas() {
        return tvprogrammas;
    }

    public void setTvprogrammas(ArrayList<Tvprogramma> tvprogrammas) {
        this.tvprogrammas = tvprogrammas;
    }

    public String toString() {
        return "Tvgids{" +
                "tvprogrammas=" + tvprogrammas +
                '}';
    }
}
