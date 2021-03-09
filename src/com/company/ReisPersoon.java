package com.company;

public class ReisPersoon {
    private String naam;
    private Rijbewijs rijbewijs;
    private Reisdocument reisdocument;

    public ReisPersoon(String naam, Rijbewijs rijbewijs, Reisdocument reisdocument) {
        this.naam = naam;
        this.rijbewijs = rijbewijs;
        this.reisdocument = reisdocument;
    }
    public ReisPersoon(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;

    }
    public ReisPersoon(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setRijbewijs(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public void setReisdocument(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
    }
    public Legitimatiebewijs getLegitimatie(){
        if(rijbewijs != null) {
            return rijbewijs;
        }
        else if(reisdocument != null){
            return reisdocument;
        }
        else{
            return null;
        }
    }
    public void toonOverzicht(){
        System.out.println( this.naam +", BSN: "+this.getLegitimatie().getBSN()+"\n" +
                getLegitimatie());
    }
    @Override
    public String toString() {
        return "ReisPersoon{" +
                "naam='" + naam + '\'' +
                ", rijbewijs=" + rijbewijs +
                ", reisdocument=" + reisdocument +
                '}';
    }
}
