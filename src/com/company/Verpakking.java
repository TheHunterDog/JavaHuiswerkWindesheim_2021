package com.company;

public class Verpakking {
    private int lengte;
    private int breedte;
    private int hoogte;
    private boolean vloeistof;
    public Verpakking(int lengte, int breedte, int hoogte, boolean vloeistof){
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.vloeistof = vloeistof;
    }
    public int getVolume(){
        return this.hoogte* this.breedte * this.lengte;
    }
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Verpakking) {
            Verpakking verpakking = (Verpakking) obj;
            if (this.vloeistof && verpakking.vloeistof) {
                return this.getVolume() == verpakking.getVolume();
            } else {
//                return (this.lengte == verpakking.lengte && this.breedte == verpakking.breedte && this.hoogte == verpakking.hoogte);
                if(this.lengte == verpakking.lengte || this.lengte == verpakking.breedte || this.lengte == verpakking.hoogte){
                    if(this.hoogte == verpakking.lengte || this.hoogte == verpakking.breedte || this.hoogte == verpakking.hoogte){
                        if(this.breedte == verpakking.lengte || this.breedte == verpakking.breedte || this.breedte == verpakking.hoogte){
                          return true;
                        }
                    }
                }
            }
        }
        return false;

    }
}
