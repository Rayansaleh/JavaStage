import static java.lang.Integer.sum;

public class Moyenne_EcartType {

    public static void main(String[] args){

        int somme = 0;
        int[] Tableau = {1, 2, 4, 5, 6, 12, 14, 9, 7, 10};

        int l = Tableau.length;
        for(int i : Tableau){
            somme += i;
        }

        int Moyenne = somme / l;
        System.out.println(Moyenne);

    }


    }

