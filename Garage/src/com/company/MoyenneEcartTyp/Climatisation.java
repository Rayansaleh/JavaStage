package com.company.MoyenneEcartTyp;

public class Climatisation implements Option{
    @Override
    public String getNomOption() {
        return "Climatisation";
    }

    @Override
    public double getPrix() {
        return 76.0;
    }
}
