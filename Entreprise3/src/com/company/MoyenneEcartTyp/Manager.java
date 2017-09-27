package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Salarie {

    private double salaireManager;
    private String nom;



    public Manager(){
        super();
        AfficherSalaire();

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



    public String getNom() {
        return nom;
    }
}
