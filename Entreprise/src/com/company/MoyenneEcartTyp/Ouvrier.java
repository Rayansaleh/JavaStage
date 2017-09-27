package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Ouvrier extends Entreprise
{

    private double salaireOuvrier;
    private int heureTravail;
    private String nom;


    public Ouvrier(int heureTravail, String nom)
    {
        this.heureTravail = heureTravail;
        this.nom = nom;
    }

    @Override
    public double Remuneration()
    {

        salaireOuvrier = 18 * heureTravail;
        return salaireOuvrier;

    }


    public String getNom() {
        return nom;
    }
}
