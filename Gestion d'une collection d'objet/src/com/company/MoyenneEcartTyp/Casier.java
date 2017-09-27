package com.company.MoyenneEcartTyp;

public class Casier extends Entiers
{


    public void Range(int k, int i)
    {
        int[] tab = new int[10];
        int somme = 0;
        for(i = 0; i < tab.length; i++)
        {
            k = (int) (Math.random() * 100);
            tab[i] = k;
            System.out.println("La case " + i + " contient " + k);
            somme += tab[i];

        }
        System.out.println("La somme des valeurs du tableau donne : " + somme);
    }

    public int Premier(){

        return 0;
    }

    public int Suivant(){


        return 0;
    }

    @Override
    public boolean IlEnReste() {
        return false;
    }

    public boolean IlEnReste(int x, boolean z)
    {

        if(x < 10)
        {
            z = true;
        }
        else if(x >= 10)
        {
            z = false;
        }
        return z;
    }
}
