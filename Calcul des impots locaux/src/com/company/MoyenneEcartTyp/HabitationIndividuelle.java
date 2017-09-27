package com.company.MoyenneEcartTyp;

public class HabitationIndividuelle extends Habitation{

    int NbPiece;
    boolean Piscine;

    @Override
    public double Impot() {
        double prix = 0;

        prix += 100 * NbPiece + 2 * surface;
        if (Piscine == true) {
            prix += 500;
        }
        System.out.println("Le montant des impots s'élève à " + prix + "€");
        return prix;
    }

    @Override
    public void Affiche() {
        super.Affiche();
        System.out.println("il y a " + NbPiece + " pièce");
        if (Piscine = true){
            System.out.println("Et une piscine");
        }
        else{}

    }

    public HabitationIndividuelle(String P, String A, double S, int NbP, boolean Pi) {
        super(P, A, S);
        this.Piscine = Pi;
        this.NbPiece = NbP;
    }
}
