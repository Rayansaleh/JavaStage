package com.company.MoyenneEcartTyp;

public class HabitationProfessionnelle extends Habitation
{

    int Nbemploye;


    @Override
    public double Impot()
    {
        double prix;
        int c = 10;


            while(Nbemploye != c)
            {
                if (Nbemploye < 10)
                {
                    Nbemploye = 0;
                    break;
                }

                if (Nbemploye >= c)
                {
                    c += 10;
                }
                else if (Nbemploye < c && Nbemploye != 0)
                {

                    Nbemploye = c;
                }
            }


        prix = 2 * surface + (Nbemploye / 10) * 1000;

        System.out.println("Le montant des impots s'élève à " + prix + "€");
        return prix;
    }

    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println("L'entreprise comporte " + Nbemploye + " employe");
    }

    public HabitationProfessionnelle(String P, String A, double S, int N) {
        super(P, A, S);
        this.Nbemploye = N;
    }
}
