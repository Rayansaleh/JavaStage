package com.company.MoyenneEcartTyp;

public class D4 extends Vehicule {

    public D4(){
        super();
    }

    @Override
    public String getNom() {
        return "D4";
    }

    @Override
    public Marque getNomMarque() {
        return Marque.TROEN;
    }

    @Override
    public double getPrix() {
        return 7655.0;
    }
}