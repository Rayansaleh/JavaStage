package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Entreprise Ebiznext = new Entreprise("Ebiznext");
        Ouvrier Rayan = new Ouvrier(20);
        Ouvrier Hayssam = new Ouvrier(30);
        Ouvrier Celine = new Ouvrier(35);
        Ouvrier Jaafar = new Ouvrier(23);

        Manager Nadine = new Manager();
        Salarie Farid = new Manager();

        Nadine.addService(Rayan);
        Nadine.addService(Celine);
        Nadine.addService(Jaafar);
        Farid.addService(Hayssam);
        Farid.addService(Celine);

        Ebiznext.addOuvrier(Rayan);
        Ebiznext.addOuvrier(Hayssam);
        Ebiznext.addOuvrier(Celine);
        Ebiznext.addOuvrier(Jaafar);
        Ebiznext.addManager(Nadine);
        Ebiznext.addManager(Farid);

        Nadine.AfficherSalaire();
        Farid.AfficherSalaire();

        Ebiznext.ChiffreAffaire();


    }
}
