package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Entreprise
{

    private double chiffreAffaire;
    private String nom;
    //private String nomSalarie;
    //private int heureTravailSalarie;

    List<Salarie> salaries = new ArrayList<>();

    public Entreprise(String nom)
    {
        this.nom = nom;
    }

    public void addSalarie(Salarie salarie)
    {
        salaries.add(salarie);
    }

    public double ChiffreAffaire()
    {

        chiffreAffaire = salaries.stream().map(Salarie::Remuneration) .reduce(0d, (a, b) -> a + b);
        chiffreAffaire *= 1.2;
        System.out.println(this.getNom() + " a un chiffre d'affaire de " + chiffreAffaire + "€");

        return chiffreAffaire;
    }

    /*public void ajouterOuvrier(String nom, int heureTravail){
        this.nomSalarie = nom;
        this.heureTravailSalarie = heureTravail;
        salaries.add(new Ouvrier(nom, heureTravail));

    }

    public void ajouterManager(String nom){
        this.nomSalarie = nom;
        salaries.add(new Manager(nom));
    }*/

    public void salarieEntreprise()
    {
        salaries.stream().forEach(i -> i.AfficherSalaire());
    }

    public void TriSalarie(double salaireMin)
    {

        salaries.stream().map(x -> nom.substring(0, 1).toUpperCase() + nom.substring(1));
        salaries.stream().filter(x -> x.Remuneration() > salaireMin).forEach(i -> i.AfficherSalaire());

    }

    public String getNom()
    {
        return nom;
    }
}
