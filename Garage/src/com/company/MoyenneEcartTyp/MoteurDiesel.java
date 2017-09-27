package com.company.MoyenneEcartTyp;

public class MoteurDiesel extends Moteur{

    public MoteurDiesel(String cylindre, double prix){
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.DIESEL;
    }
}
