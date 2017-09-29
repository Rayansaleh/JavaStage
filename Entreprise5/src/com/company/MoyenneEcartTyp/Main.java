package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Entreprise Ebiznext = new Entreprise("Ebiznext");
        Ouvrier rayan = new Ouvrier("Rayan", 20);
        Ouvrier farid = new Ouvrier("Farid", 30);
        Ouvrier celine = new Ouvrier("Celine",35);
        Ouvrier jaafar = new Ouvrier("Jaafar",23);

        Manager nadine = new Manager("Nadine");
        Manager hayssam = new Manager("Farid");

        nadine.addService(rayan);
        nadine.addService(celine);
        nadine.addService(jaafar);
        hayssam.addService(farid);
        hayssam.addService(celine);

        Ebiznext.addSalarie(rayan);
        Ebiznext.addSalarie(hayssam);
        Ebiznext.addSalarie(celine);
        Ebiznext.addSalarie(jaafar);
        Ebiznext.addSalarie(nadine);
        Ebiznext.addSalarie(farid);

        nadine.AfficherSalaire();
        hayssam.AfficherSalaire();

        Ebiznext.ChiffreAffaire();
    }

}