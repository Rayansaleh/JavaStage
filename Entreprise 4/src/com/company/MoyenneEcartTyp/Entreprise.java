package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {

    private double chiffreAffaire;
    private String nom;

    List<Salarie> salaries = new ArrayList<>();

    public Entreprise(String nom){
        this.nom = nom;
    }

    public void addSalarie(Salarie salarie){
        salaries.add(salarie);
    }

    public double ChiffreAffaire(){


        for (int i = 0; i < salaries.size(); i++) {
            chiffreAffaire += salaries.get(i).Remuneration();
        }

        chiffreAffaire *= 1.2;
        System.out.println(this.getNom() + " a un chiffre d'affaire de " + chiffreAffaire + "€");

        return chiffreAffaire;
    }

    public String getNom() {
        return nom;
    }
}
