package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Salarie{

    private double salaireManager;
    private String nom;

    List<Ouvrier> service = new ArrayList<>();
    List<Manager> managers = new ArrayList<>();

    public Manager(String nom){
        this.nom = nom;
        addManager(this);
    }

    public void addService(Ouvrier ouvrier){
        service.add(ouvrier);

    }

    public void addManager(Manager manager){
        managers.add(manager);
    }

    @Override
    public double Remuneration() {
        double k;
        for (int j = 0; j < managers.size(); j++) {
            for (int i = 0; i < service.size(); i++) {
                k = service.get(i).Remuneration();
                salaireManager += k;
            }
            salaireManager /= 2.5;
            System.out.println(managers.get(j).getNom() + " a un salaire de " + this.salaireManager + "€");
        }
        return salaireManager;

    }

    public String getNom() {
        return nom;
    }
}
