package com.company.MoyenneEcartTyp;

public class SiegeChauffant implements Option{
    @Override
    public String getNomOption() {
        return "Siege chauffant";
    }

    @Override
    public double getPrix() {
        return 120.0;
    }
}
