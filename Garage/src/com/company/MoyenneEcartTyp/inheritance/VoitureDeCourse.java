package com.company.MoyenneEcartTyp.inheritance;

public class VoitureDeCourse extends Voiture {
    int gagnees;
    VoitureDeCourse(int puissance, int gagnees) {
        super(puissance);
    }
    public int getGagnees() { return gagnees; }
}
