package com.company.MoyenneEcartTyp;

public class Syracuse extends Entiers {

    public Syracuse(int U0){

        int Un;
        Un = U0;
        int somme = 0;
        System.out.println("Nouvelle Suite *************");
        while(Un >1)
        {
            if (Un % 2 == 0) {
                Un = Un / 2;
            } else if (Un % 2 != 0) {
                Un = 3 * Un + 1;
            }
            System.out.println(Un);
            somme += Un;
        }
        System.out.println("La somme des Un est egal à : " + somme);

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

    public boolean IlEnReste(int x, boolean z) {

        if (x >= 1) {
            z = true;
        }
        else{
            z = false;
        }
        return z;
    }
    }

