package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Ouvrier implements Salarie {

    private int heureTravail;
    private double salaireOuvrier;
    private String nom;


    public Ouvrier(int heureTravail, String nom){
        this.heureTravail = heureTravail;
        this.nom = nom;
        AfficherSalaire();

    }



    @Override
    public double Remuneration() {

        salaireOuvrier = 18 * heureTravail;

        return salaireOuvrier;
    }

    @Override
    public void AfficherSalaire() {

            System.out.println(this.getNom() + " a un salaire de " + this.Remuneration() + "€");
    }


    public String getNom() {
        return nom;
    }
}
