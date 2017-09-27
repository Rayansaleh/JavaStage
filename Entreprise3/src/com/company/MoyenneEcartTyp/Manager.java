package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Salarie {

    private double salaireManager;
    private String nom;
    private double sommeSalaire;

    private List<Ouvrier> service = new ArrayList<>();

    public Manager(String nom){
        this.nom = nom;

    }

    public void addService(Ouvrier ouvrier){
        service.add(ouvrier);
    }




    @Override
    public double Remuneration() {
        double k;
            for (int i = 0; i < service.size(); i++) {
                k = service.get(i).Remuneration();
                salaireManager += k;
            }
            salaireManager /= 2.5;

        return salaireManager;
    }

    @Override
    public void AfficherSalaire() {
        System.out.println(this.getNom() + " à un salaire de " + this.Remuneration() + "€");
    }


    public String getNom() {
        return nom;
    }
}
