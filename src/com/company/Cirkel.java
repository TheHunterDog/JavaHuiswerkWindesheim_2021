package com.company;

public class Cirkel {
    private double straal;
    public Cirkel(double straal){
        this.straal = straal;

    }
    public double berekenOmtrek(){
       return Math.PI * Math.pow(this.straal, 2);

    }
}
