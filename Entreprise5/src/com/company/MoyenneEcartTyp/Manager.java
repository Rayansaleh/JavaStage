package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

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
        salaireManager = service.stream().map(Ouvrier::Remuneration).reduce(0d, (a, b) -> a + b);
        salaireManager /= 2.5;

        return salaireManager;
    }

}