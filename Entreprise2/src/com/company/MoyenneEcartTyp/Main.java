package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
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









    }
}
