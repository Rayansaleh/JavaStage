package com.company.MoyenneEcartTyp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Habitation[] TableauHabitation;

        TableauHabitation = new Habitation[5];

        TableauHabitation[0] = new HabitationProfessionnelle("Jean", "METZ", 2500, 130);
        TableauHabitation[1] = new HabitationProfessionnelle("Export", "METZ", 250, 10);
        TableauHabitation[2] = new HabitationIndividuelle("Paul", "METZ", 100, 5, false);
        TableauHabitation[3] = new HabitationProfessionnelle("Import", "METZ", 1200, 90);
        TableauHabitation[4] = new HabitationIndividuelle("Jean", "METZ", 130, 6, true);

        for(int i = 0; i < TableauHabitation.length; i++) {
            TableauHabitation[i].Affiche();
            double I = TableauHabitation[i].Impot();
            System.out.println("\n###########################\n");
        }

    }
}
