package com.company.MoyenneEcartTyp.inheritance;

public class Voiture {
    private int puissance;

    Voiture(int puissance) {
        this.puissance = puissance;
    }

    public int getPuissance() { return puissance; }

    static String author = "Hayssam";

    static public String getAuthor() { return author;}
}
