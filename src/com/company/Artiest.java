package com.company;

public class Artiest {
    private String naam;
    public Artiest(String naam){
        this.naam = naam;
    }
    public String toString() {
        return this.naam+ "(een artiest)";
    }
    public String getNaam(){
        return naam;
    }
    public boolean equals(Object other) {
        if (other != null) {
            if (other instanceof Artiest) {
                Artiest otherA = (Artiest) other;
                if(this.naam.equals(otherA.getNaam())){
                    return true;
                }
            }
        }
        return false;
    }
}
