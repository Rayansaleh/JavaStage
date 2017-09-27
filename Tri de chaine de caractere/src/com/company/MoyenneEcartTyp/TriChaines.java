package com.company.MoyenneEcartTyp;

public class TriChaines {

    public void TriTableauChaines(String[] Tableau)
    {
        int tailletab = Tableau.length;
        int resultat;
            for (int i = 0; i <= tailletab; i++)
            {
                for (int j = i + 1; j < tailletab; j++)
                {
                    resultat = Tableau[i].compareTo(Tableau[j]);

                    if(resultat > 0)
                    {
                        Tableau[j] = Tableau[i];
                        Tableau[i] = temp;
                    }
                    else if (resultat == 0)
                    {

                    }


                }
            }
    }

}
