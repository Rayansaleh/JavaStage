package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Ouvrier implements Salarie{

    private double salaireOuvrier;
    private  int heureTravail;
    private String nom;

    List<Ouvrier> ouvriers = new ArrayList<>();

    public Ouvrier(int heureTravail, String nom){
        this.heureTravail =heureTravail;
        this.nom = nom;
        addOuvrier(this);
    }

    public void addOuvrier(Ouvrier ouvrier){
        ouvriers.add(ouvrier);
    }

    @Override
    public double Remuneration() {
        for(int i = 0; i < ouvriers.size(); i++) {
            salaireOuvrier = 0;
            salaireOuvrier = 18 * heureTravail;
            System.out.println(ouvriers.get(i).getNom() + " a un salaire de " + this.salaireOuvrier + "€");

        }
        return salaireOuvrier;
    }

    public String getNom() {
        return nom;
    }
}
