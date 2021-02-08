package com.company;

public class Auto {
    private int marge =20;
 //    Opgave 1 huiswerkweek2
    private String merk;
    private String type;
    private int pk;
    private Aanhanger aanhanger;
    private int maxOpvoerPks;
    private boolean opgevoerd = false;
    private String fabriek = null;
//    Opdracht 1 uit week 2 les 1
    public Auto(){
        pk = 20;
        merk = "Merk onbekend";
        type = "";
        this.maxOpvoerPks = pk - marge;

    }
//    Opdracht 2 uit week 2 les 1
    public Auto(String merk,String type,int pk){
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.maxOpvoerPks = pk - marge;

    }
    public Auto(String merk,String type,int pk,String fabriek){
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.fabriek = fabriek;
        this.maxOpvoerPks = pk - marge;

    }
//    opgave 4
    public int berekenOpvoerMogelijkheid(){
        return  this.maxOpvoerPks;
    }
//    Opgave 3 / 5
    public void VergelijkPk(Auto rivaal){
        Auto deBeste;
        if (pk > rivaal.getPk()){
             deBeste = this;
        }
        else{
            deBeste = rivaal;
        }
        System.out.println("De "+ deBeste.merk + " heeft meer vermogen dan de " + rivaal.getMerk() +", het verschil is " + (deBeste.getPk() - rivaal.getPk()) + "pk" );
    }
//    Opgave 4
    public void voerOp(int extraPk){
        if(opgevoerd){
            System.out.println("Deze auto is al een keer opgevoerd");
        }
        else{
        System.out.println(merk + " opvoeren met " + extraPk +" PK");
        if(this.berekenOpvoerMogelijkheid() < extraPk){
            System.out.println("Dat is te veel. Nu gaan we niks doen!!111!!");
        }else {
            setPk(getPk()+extraPk);
            this.opgevoerd = true;
        }
        System.out.println("Resultaat: " + this.toString());
    }
    }
//    Opgave 1
    public String toString(){
        if (fabriek== null){
            return getMerk()+" " + getType() +" ("+ getPk()+"PK, " + (this.opgevoerd == false ? "Maximaal op te voeren met "+this.berekenOpvoerMogelijkheid() : " al opgevoerd") +")" ;

        }
        return getMerk()+" " + getType() +" ("+ getPk()+"PK, " + (this.opgevoerd == false ? "Maximaal op te voeren met "+this.berekenOpvoerMogelijkheid() : " Is al opgevoerd") +") uit de fabriek:"+ this.fabriek  ;

    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setPk(int pk) {
        this.pk = pk;
        this.maxOpvoerPks = pk - marge;
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

    public boolean getOpgevoerd() {
        return this.opgevoerd;
    }
}
