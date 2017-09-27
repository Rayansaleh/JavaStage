package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Entreprise Ebiznext = new Entreprise("Ebiznext");
        Salarie Rayan = new Ouvrier(20);
        Salarie Hayssam = new Ouvrier(30);
        Salarie Celine = new Ouvrier(35);
        Salarie Jaafar = new Ouvrier(23);

        Salarie Nadine = new Manager();
        Salarie Farid = new Manager();

        Nadine.addService(Rayan);
        Nadine.addService(Celine);
        Nadine.addService(Jaafar);
        Farid.addService(Hayssam);
        Farid.addService(Celine);

        Ebiznext.addSalarie(Rayan);
        Ebiznext.addSalarie(Hayssam);
        Ebiznext.addSalarie(Celine);
        Ebiznext.addSalarie(Jaafar);
        Ebiznext.addSalarie(Nadine);
        Ebiznext.addSalarie(Farid);

        Nadine.AfficherSalaire();
        Farid.AfficherSalaire();

        Ebiznext.ChiffreAffaire();
    }
}
