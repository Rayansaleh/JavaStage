package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Entreprise Ebiznext = new Entreprise();
        List<Entreprise> employe = new ArrayList<>();
        Ouvrier Rayan = new Ouvrier(20, "Rayan");
        Ouvrier Hayssam = new Ouvrier(30, "Hayssam");
        Ouvrier Celine = new Ouvrier(35, "Celine");
        Ouvrier Jaafar = new Ouvrier(23, "Jaafar");

        Manager Nadine = new Manager("Nadine");
        Manager Farid = new Manager("Farid");


        Nadine.addService(Rayan);
        Nadine.addService(Celine);
        Nadine.addService(Jaafar);
        Farid.addService(Hayssam);
        Farid.addService(Celine);


        Rayan.addEmploye(employe, Rayan);
        Hayssam.addEmploye(employe, Hayssam);
        Celine.addEmploye(employe, Celine);
        Jaafar.addEmploye(employe, Jaafar);
        Nadine.addEmploye(employe, Nadine);
        Farid.addEmploye(employe, Farid);

        Ebiznext.Repartition(employe);

        Ebiznext.chiffreAffaire();


    }
}
