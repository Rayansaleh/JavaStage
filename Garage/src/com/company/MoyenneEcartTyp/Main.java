package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicule lag1 = new Lagouna();
        lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
        lag1.addOption(new GPS());
        lag1.addOption(new SiegeChauffant());
        lag1.addOption(new VitreElectrique());

        System.out.println(lag1);
        lag1.afficheOption();
    }
}
