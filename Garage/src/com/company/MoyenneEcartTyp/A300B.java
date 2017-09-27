package com.company.MoyenneEcartTyp;

public class A300B extends Vehicule {

    public A300B(){
        super();
    }

    @Override
    public String getNom() {
        return "A300B";
    }

    @Override
    public Marque getNomMarque() {
        return Marque.PIGEOT;
    }

    @Override
    public double getPrix() {
        return 10456.0;
    }
}
