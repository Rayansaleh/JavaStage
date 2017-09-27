package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] Tableau = {"un", "deux", "trois", "quatre", "cinq"};

        TriChaines Tri = new TriChaines();
        Tri.TriTableauChaines(Tableau);

        for (int i = 0; i < Tableau.length; i++)
            System.out.print(Tableau[i] + " ");
    }
}
