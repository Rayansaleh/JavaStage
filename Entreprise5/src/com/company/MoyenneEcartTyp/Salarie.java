package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public abstract class Salarie {

    private String nom;


    public Salarie(){
        this.nom = getNom();
    }


    public abstract double Remuneration();

    public void AfficherSalaire(){
        System.out.println(this.nom + " à un salaire de " + this.Remuneration() + "€");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}