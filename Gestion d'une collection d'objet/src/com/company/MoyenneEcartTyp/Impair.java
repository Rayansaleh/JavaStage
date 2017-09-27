package com.company.MoyenneEcartTyp;

public class Impair extends Entiers
{

    public Impair()
    {

    }
    //Affiche le premier entier impair
    public int Premier()
    {
        return 1;
    }

    @Override
    public int Suivant() {
        return 0;
    }

    @Override
    public boolean IlEnReste() {
        return false;
    }

    //Affiche les nombres impaires  en verifiant si le nombre précedent etait pair ou impair
    public int Suivant(int x)
    {

        if(x % 2 != 0)
        {
            x += 2;
        }
        else if(x % 2 == 0)
        {
            x += 1;
        }
        return x;

    }
    //Verifie si il est encore possible d'ajouter des valeurs
    public boolean IlEnReste(int x, boolean z)
    {

        if(x < 100)
        {
            z = true;
        }
        else if(x >= 100)
        {
            z = false;
        }
        return z;
    }
}
