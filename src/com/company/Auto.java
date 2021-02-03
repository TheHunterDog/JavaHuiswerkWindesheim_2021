package com.company;

public class Auto {
//    Opgave 1 huiswerkweek2
    private String merk;
    private String type;
    private int pk;
    private Aanhanger aanhanger;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAanhanger(Aanhanger aanhanger) {
        this.aanhanger = aanhanger;
    }

    public int getPk() {
        return pk;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public Aanhanger getAanhanger() {
        return aanhanger;
    }
}
