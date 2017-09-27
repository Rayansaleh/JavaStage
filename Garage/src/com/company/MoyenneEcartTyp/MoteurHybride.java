package com.company.MoyenneEcartTyp;

public class MoteurHybride extends Moteur{

    public MoteurHybride(String cylindre, double prix){
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.HYBRIDE;
    }
}
