package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Entreprise {

    private double salaireManager;
    private String nom;

    //Liste contenant les ouvrier sous les ordres d'un manager precis.
    List<Ouvrier> service = new ArrayList<>();

    public Manager(String nom) {

        this.nom = nom;

    }

    public void addService(Ouvrier ouvrier) {
        this.service.add(ouvrier);
    }

    @Override
    public double Remuneration() {


        double k;
        for (int j = 0; j < service.size(); j++) {
            k = service.get(j).Remuneration();
            salaireManager += k;
        }

        salaireManager /= 2.5;

        return salaireManager;
    }


    public String getNom() {
        return nom;
    }
}
