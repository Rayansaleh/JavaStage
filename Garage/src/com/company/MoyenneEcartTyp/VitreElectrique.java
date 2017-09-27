package com.company.MoyenneEcartTyp;

public class VitreElectrique implements Option{
    @Override
    public String getNomOption() {
        return "Vitre electrique";
    }

    @Override
    public double getPrix() {
        return 90.0;
    }
}
