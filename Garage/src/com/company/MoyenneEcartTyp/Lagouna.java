package com.company.MoyenneEcartTyp;

public class Lagouna extends Vehicule{

    public Lagouna(){
        super();
    }

    @Override
    public String getNom() {
        return "Lagouna";
    }

    @Override
    public Marque getNomMarque() {
        return Marque.RENO;
    }

    @Override
    public double getPrix() {
        return 9790.0;
    }
}
