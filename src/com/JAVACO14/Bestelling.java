package com.JAVACO14;

public class Bestelling {

    private boolean suiker;
    private boolean melk;
    private String specialeWensen;

    public void setSuiker(boolean suiker) {
        this.suiker = suiker;
    }

    public void setMelk(boolean melk) {
        this.melk = melk;
    }

    public void setSpecialeWensen(String specialeWensen) {
        this.specialeWensen = specialeWensen;
    }

    public String toString() {
        String bestelling = "Uw bestelling: koffie ";
        if (suiker) {
            bestelling += " met suiker, ";
        } else {
            bestelling += " zonder suiker, ";
        }
        if (melk) {
            bestelling += " met melk";
        } else {
            bestelling += " zonder melk";
        }
        if (!specialeWensen.equals("")) {
            bestelling += ", speciale wensen: " + specialeWensen;
        }
        return bestelling;
    }

}
