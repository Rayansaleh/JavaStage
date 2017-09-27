package com.company.MoyenneEcartTyp;

import java.util.Scanner;

public class Main {

    private int somme;

    public Main(int[] cof, int x)
    {

        somme =0;
        CalcSomme(cof, x, cof.length - 1);

    }

    private void CalcSomme(int[] cof, int x, int a)
    {

        somme = cof[a] * x;
            for(int i = a - 1; i >= 1; i--)
            {
                 somme = (somme + cof[i]) * x;
            }
        somme += cof[0];
    }

    public static void main(String[] args)
    {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Puissance Maximale : ");
        int pmax = sc.nextInt();
        int[] arr  = new int[pmax + 1];

        System.out.println("Entrer" + (pmax + 1) + " coefficient dans l'ordre croissant");

            for(int i = 0; i <= pmax; i++)
            {
              arr[i] = sc.nextInt();
            }

            System.out.println("Entrer x : ");

        int x = sc.nextInt();
        Main horner = new Main(arr, x);
        System.out.println("Resultat = " + horner.somme);



    }
}
