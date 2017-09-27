package com.company.MoyenneEcartTyp;

public class MoteurElectrique extends Moteur{

    public MoteurElectrique(String cylindre, double prix){
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.ELECTRIQUE;
    }
}
