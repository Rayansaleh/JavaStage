package com.company.MoyenneEcartTyp;

public abstract class Personnage {

    public String armes = " ";

    public String chaussure = " ";

    public String sacDeSoin = " ";

    public EspritCombatif combat(){

        return null;
    }

    public Deplacement deplacement(){

        return null;
    }

    public Soin soin(){

        return null;
    }

    public void setArmes(String armes) {
        this.armes = armes;
    }

    public void setChaussure(String chaussure) {
        this.chaussure = chaussure;
    }

    public void setSacDeSoin(String sacDeSoin) {
        this.sacDeSoin = sacDeSoin;
    }
}
