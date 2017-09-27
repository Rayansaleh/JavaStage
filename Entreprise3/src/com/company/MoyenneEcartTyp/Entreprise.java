package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private double chiffreAffaire;
    private String nom;

    List<Ouvrier> ouvriers = new ArrayList<>();
    List<Manager> managers = new ArrayList<>();

    public Entreprise(String nom){
        this.nom = nom;
    }

    public void addOuvrier(Ouvrier ouvrier){
        ouvriers.add(ouvrier);
        }

    public void addManager(Manager manager){
        managers.add(manager);
    }

    public double ChiffreAffaire(){

        double o = 0;
        double m = 0;
        for (int i = 0; i < ouvriers.size(); i++){
            o += ouvriers.get(i).Remuneration();
        }

        for (int j = 0; j < managers.size(); j++){
            m += managers.get(j).Remuneration();
        }

        chiffreAffaire = o + m;
        chiffreAffaire *= 1.2;
        System.out.println(this.getNom() + " a un chiffre d'affaire de " + chiffreAffaire + "€");

        return chiffreAffaire;
    }

    public String getNom() {
        return nom;
    }
}
