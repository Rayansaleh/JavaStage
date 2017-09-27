package com.company.MoyenneEcartTyp;

public class GPS implements Option{
    @Override
    public String getNomOption() {
        return "GPS";
    }

    @Override
    public double getPrix() {
        return 100.0;
    }
}
