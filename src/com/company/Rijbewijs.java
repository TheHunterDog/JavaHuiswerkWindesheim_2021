package com.company;

public class Rijbewijs implements Legitimatiebewijs {
    private String naam;
    private String BSN;
    private String categorie;

    @Override
    public String toString() {
        return "Rijbewijs{" +
                "naam='" + naam + '\'' +
                ", BSN='" + BSN + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    public Rijbewijs(String naam, String BSN, String categorie) {
        this.naam = naam;
        this.BSN = BSN;
        this.categorie = categorie;
    }

    @Override
    public String getDocumentType() {
        return this.getDocumentType();
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public String getBSN() {
        return BSN;
    }

    public String getCategorie() {
        return categorie;
    }
}
