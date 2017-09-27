package com.company.MoyenneEcartTyp;

public abstract class Moteur {

    public TypeMoteur type;
    public String cylindre;
    public double prix;


    public Moteur(String cylindre, double prix){
        this.prix = prix;
        this.cylindre = cylindre;

    }

    public TypeMoteur getType() {
        return type;
    }

    public double getPrix() {
        return prix;
    }

    public String toString(){

        return ("Moteur : " + getType() + "puissance : " + this.cylindre);
    }
}
