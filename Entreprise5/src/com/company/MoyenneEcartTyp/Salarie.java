package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public abstract class Salarie
{

    private String nom;
    private int id_salarie;

    public Salarie(String nom)
    {
        this.nom = nom;
    }


    public abstract double Remuneration();

    public void AfficherSalaire()
    {
        System.out.println(this.nom + " à un salaire de " + this.Remuneration() + "€");
    }



}