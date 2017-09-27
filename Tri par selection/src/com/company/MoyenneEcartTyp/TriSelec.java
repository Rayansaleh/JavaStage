package com.company.MoyenneEcartTyp;

public class TriSelec
{

    //Création d'un Tableau
    static int[] S = {0, 8, 5, 7, 9, 2, 1, 12, 6};

    //Methode permettant d'afficher toutes les cases d'un tableau
    static void AfficherTable()
    {
        int n = S.length-1;

            for (int i = 1; i <= n; i++)
            {
                System.out.print(S[i] + ", ");
            }
    }

    //Methode gerant le tri, elle permet de réduire la taille du tableau a chaque tour de bloucle.
    //Puis elle compare une valeure du tableau avec toute les suivantes.
    //Si cette valeure s'avère être inférieur aux suivantes elle est echangé de case.
    static void TriSelection()
    {

        int n = S.length-1;

            for(int i = 1; i <= n-1; i++)
            {
                int m = i;

                for(int j = i + 1; j <= n; j++)
                {
                    if(S[j] < S[m])
                    {
                        m = j;
                    }
                    int temp = S[m];
                    S[m] = S[i];
                    S[i] = temp;

                }
            }
    }
    public static void main(String[] args)
    {
        // write your code here
        System.out.println("Tableau sans tri : ");
        AfficherTable();
        TriSelection();
        System.out.println("\n \nTableau après le tri : ");
        AfficherTable();


    }
    }
