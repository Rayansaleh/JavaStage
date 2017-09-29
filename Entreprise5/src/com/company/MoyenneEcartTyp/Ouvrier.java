package com.company.MoyenneEcartTyp;

public class Ouvrier extends Salarie{

    private int heureTravail;
    private double salaireOuvrier;

    public Ouvrier(String nom, int heureTravail){
        super(nom);
        this.heureTravail = heureTravail;
        AfficherSalaire();

    }

    @Override
    public double Remuneration() {
        salaireOuvrier = 18 * heureTravail;

        return salaireOuvrier;
    }

}
