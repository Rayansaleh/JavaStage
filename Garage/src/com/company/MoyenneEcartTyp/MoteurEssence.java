package com.company.MoyenneEcartTyp;

public class MoteurEssence extends Moteur{

    public MoteurEssence(String cylindre, double prix){
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.ESSENCE;
    }
}
