package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Salarie{

    private double salaireManager;

    public List<Ouvrier> service = new ArrayList<>();

    public Manager(String nom){
        super(nom);
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
}