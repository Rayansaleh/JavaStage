package com.company.MoyenneEcartTyp.inheritance;

public class App {
    static void main(String args[]) {
        Voiture.getAuthor();
        Voiture v = new Voiture(10);
        VoitureDeCourse vc = new VoitureDeCourse(11, 2);
        v.getPuissance(); // 10
        v = vc;
        vc.getGagnees();
        v.getPuissance(); // 11
    }
}


/*
- Compter le nombre de lignes dans un fichier
- compter le nombre de mots ans un fichier
- Compter le nombre de voyelles et de consonnes dans un fichier
 */

/*
- Dans une entreprise on distingue deux types de salariés : Les managers et les ouvriers
- Un manager est rémunéré en fonction du nombre d'ouvriers qu'il manage. SOn salaire est le salaire cumulé des ouvriers qu'il manage divisé par 2,5
- un ouvrier est payé en fonction du nombre d'heures qu'il a travaillé

- Sachant que la salaire horaire est de 18euros, écrire un programme qui permet de calculer les salaires des salariés suivants :
Rayan est un ouvrier qui a travaillé 20heures
Hayssam est un ouvrier qui a travaillé 30 heures
Celine est un ouvrier qui a travaillé 35 heures
Jaafar est un ouvrier qui a travaillé 23 heures

Nadine est le manager de Rayan et Céline et Jaafar

Farid est le manager de Hayssam et Céline

Une entreprise a pour chiffre d'affaires la somme des salaires de tous ses salariés multiplé par 1,2

Afficher les salires de tous les salriés de l'enterprise

 */