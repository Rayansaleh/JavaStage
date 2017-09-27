package com.company.MoyenneEcartTyp;

public class Habitation {
    String proprietaire;
    String adresse;
    double surface;

    //Calcul le prix a payer en fonction du type dhabitation(reference aux différentes classes)
    public double Impot(){

        double prix;
        prix = 2 * surface;
        System.out.println("Les impots vous coutes : " + prix + "€");
        return prix;
    }
    //Affiche l'ensemble des information disponible sur l'habitation en question
    public void Affiche(){

        System.out.println("Cette habitation appartient à " + proprietaire + ", \nelle se trouve a " + adresse + " \net elle a une surface de " + surface + "m2");

    }

    public Habitation(String P, String A, double S){

        this.proprietaire = P;
        this.adresse = A;
        this.surface = S;
    }
}
