package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {

    private double prix;
    private String nom;
    private List<Option> options = new ArrayList<>();
    private Marque nomMarque;
    private Moteur moteur;
    private Option o;

    public Vehicule(){

    }

    public Vehicule(String nom, Marque nomMarque, List<Option> options, double prix){
        this.nomMarque = nomMarque;
        this.nom = nom;
        this.options = options;
        this.prix = prix;
    }

    public void setMoteur(Moteur moteur){

        this.moteur = moteur;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public List<Option> getOptions() {
        return options;
    }

    public Marque getNomMarque() {
        return nomMarque;
    }

    public void addOption(Option opt){
        options.add(opt);

    }

    public double prixOption(){
        double total = 0;
        for (Option o : getOptions()){
            o.getPrix();
            total += o.getPrix();
        }
        return total;
    }

    public String toString(){

        return ("Voiture : " + getNomMarque() + " " + getNom() + moteur.toString() + "prix : ");
    }

    public void afficheOption(){
        for(int i = 0; i < options.size(); i++){
            System.out.println(options.get(i));
        }
    }


}
