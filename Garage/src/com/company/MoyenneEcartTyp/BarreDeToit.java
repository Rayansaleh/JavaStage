package com.company.MoyenneEcartTyp;

import java.util.List;

public class BarreDeToit implements Option{
    @Override
    public String getNomOption() {

        return "Barre de toit";
    }

    @Override
    public double getPrix() {
        return 43.0;
    }
}
