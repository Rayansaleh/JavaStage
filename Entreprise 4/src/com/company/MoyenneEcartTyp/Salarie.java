package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public abstract class Salarie {

    private String nom;

    public List<Ouvrier> service = new ArrayList<>();

    public Salarie(){
        this.nom = getNom();
    }

    public void addService(Salarie ouvrier){
        service.add((Ouvrier) ouvrier);
    }

    public abstract double Remuneration();

    public void AfficherSalaire(){
        System.out.println(this.getNom() + " à un salaire de " + this.Remuneration() + "€");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
