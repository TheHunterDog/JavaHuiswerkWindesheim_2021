package com.company;

public class Student extends Persoon {
    private int studentnr;

    public Student(String naam,int lengte,int leeftijd ,int studentnr){
        super(naam, lengte,leeftijd);
        this.studentnr =studentnr;
    }

    public int getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(int studentnr) {
        this.studentnr = studentnr;
    }

    public String toString() {
        return this.studentnr+ " "+this.getNaam()+" is " +this.getLengte() +"CM";
    }
}
