package com.company.MoyenneEcartTyp;

import java.util.ArrayList;
import java.util.List;

public  class Entreprise
{

    //Une liste contient les managers et l'autre les ouvriers.
    List<Manager> managers = new ArrayList<>();
    List<Ouvrier> ouvriers = new ArrayList<>();

    public double Remuneration() {
        return 0;
    }


    //Permet d'ajouter des objets de type salarié à une liste.
    public void addEmploye(List<Entreprise> employe, Entreprise salarié)
    {
        employe.add(salarié);

    }

    //Repartie en fonction de leur type les différents objet instancier dans le main.
    public void Repartition(List<Entreprise> employe)
    {

        int j = 0;
        int k = 0;
        for (int i = 0; i < employe.size(); i++)
        {


            if(employe.get(i) instanceof Manager)
            {
                managers.add((Manager) employe.get(i));
                System.out.println("Le salaire de " + managers.get(j).getNom()+ " est " + managers.get(j).Remuneration() + "€");
                j++;
            }
            else if(employe.get(i) instanceof Ouvrier)
            {
                ouvriers.add((Ouvrier) employe.get(i));
                System.out.println("Le salaire de " + ouvriers.get(k).getNom() + " est " + ouvriers.get(k).Remuneration() + "€");
                k++;
            }

        }
    }

    //Calcul le chiffre d'affaire de l'entreprise.
    public void chiffreAffaire()
    {
        double resultato = 0;
        double resultatm = 0;
        double resultat;
        for(int i = 0; i < managers.size(); i++)
        {
            double s = managers.get(i).Remuneration();
            resultatm += s;

        }
        for(int j = 0; j < ouvriers.size(); j++)
        {
            double t = ouvriers.get(j).Remuneration();
            resultato += t;

        }
        resultat = resultatm + resultato;
        resultat *= 1.2;
        System.out.println("Le chiffre d'affaire de l'entreprise est " + resultat + "€");
    }

    }

