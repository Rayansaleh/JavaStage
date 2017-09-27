package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Salarie {

    private String nom;
    public List<Ouvrier> service = new ArrayList<>();

    public Salarie(){
        this.nom = "inconnu";
    }

    double Remuneration(){

        return 0;
    }

    public void addService(Ouvrier ouvrier){
        service.add(ouvrier);
    }

    void AfficherSalaire(){
        System.out.println(this.getNom() + " à un salaire de " + this.Remuneration() + "€");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
