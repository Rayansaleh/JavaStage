package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Ouvrier extends Salarie {

    private int heureTravail;
    private double salaireOuvrier;
    private String nom;


    public Ouvrier(int heureTravail){
        super();
        this.heureTravail = heureTravail;
        AfficherSalaire();

    }

    @Override
    public double Remuneration() {

        salaireOuvrier = 18 * heureTravail;

        return salaireOuvrier;
    }

    public String getNom() {
        return nom;
    }
}
