package com.company.MoyenneEcartTyp;

import com.sun.deploy.util.SystemUtils;

public class Guerrier extends Personnage{

    public void combattre(){

        if(this.armes.equals("pistolet"))
            System.out.println("Attaque au pistolet");

        else if(this.armes.equals("Fusil de sniper"))
            System.out.print("Attaqu au sniper");

        else
            System.out.println("Attaque au couteau");
    }

}
