package com.company.oefentoets;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Melding {
    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;

    public Melding(int niveau, String dagAanduiding, LocalDate aanmaakDatum, DayOfWeek dagVanBericht) {
        setNiveau(niveau);
        this.dagAanduiding = dagAanduiding;
        this.aanmaakDatum = aanmaakDatum;
        this.dagVanBericht = dagVanBericht;
    }

    public Melding(String berichtTekst, int niveau, String dagAanduiding, LocalDate aanmaakDatum, DayOfWeek dagVanBericht) {
        this(berichtTekst,niveau);
        this.dagAanduiding = dagAanduiding;
        this.aanmaakDatum = aanmaakDatum;
        this.dagVanBericht = dagVanBericht;
    }
    public Melding(String berichtTekst,int niveau) {
        setNiveau(niveau);
        this.dagAanduiding =    "vandaag";
        this.aanmaakDatum =     LocalDate.now();
        this.dagVanBericht =    LocalDate.now().getDayOfWeek();
        this.berichtTekst =     berichtTekst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Melding melding = (Melding) o;

        if (niveau != melding.niveau) return false;
        if (berichtTekst != null ? !berichtTekst.equals(melding.berichtTekst) : melding.berichtTekst != null)
            return false;
        if (dagAanduiding != null ? !dagAanduiding.equals(melding.dagAanduiding) : melding.dagAanduiding != null)
            return false;
        if (aanmaakDatum != null ? !aanmaakDatum.equals(melding.aanmaakDatum) : melding.aanmaakDatum != null)
            return false;
        return dagVanBericht == melding.dagVanBericht;
    }

    public String toString() {
        return getNiveauAlsTekst()+": " + berichtTekst + "(" + dagAanduiding + ", " + dagVanBericht + " " + aanmaakDatum + ", niveau=" + niveau + ")";
    }

    public String getBerichtTekst() {
        return berichtTekst;
    }

    public int getNiveau() {
        return niveau;
    }

    public String getDagAanduiding() {
        return dagAanduiding;
    }

    public LocalDate getAanmaakDatum() {
        return aanmaakDatum;
    }

    public DayOfWeek getDagVanBericht() {
        return dagVanBericht;
    }
    public void setAangepasteDag(DayOfWeek aangepasteDag) {
        System.out.println(this.dagVanBericht);
        System.out.println(aangepasteDag);

        int diff = dagVanBericht.compareTo(aangepasteDag);
        System.out.println(diff);
        diff = Math.abs(diff);
        String dagaanduiding = new String();

        for (int i = 0; i < diff; i++) {
            dagaanduiding+= ("over");

        }
        dagaanduiding += ("morgen");
        this.dagAanduiding = dagaanduiding;
        this.dagVanBericht = aangepasteDag;

    }

    public void setNiveau(int niveau) {
        if (niveau > 3) {
            this.niveau = 3;
        } else if (niveau < 1) {
            this.niveau = 1;
        } else {
            this.niveau = niveau;
        }
    }

    public String getNiveauAlsTekst() {
        switch (this.niveau) {
            case 2:
                return "WAARSCHUWING";
            case 3:
                return "NOODSITUATIE";
            default:
                return "Mededeling";


        }
    }
}
