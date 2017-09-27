package com.company.MoyenneEcartTyp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Fenetre extends JFrame implements ItemListener{

    private String[] couleurs = {"rouge", "vert", "bleu", "gris", "jaune"};
    private JComboBox boite;
    Container c;

    public Fenetre(){
        this.setTitle("Chagement dynamique de couleurs");
        this.setSize(300, 300);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        boite = new JComboBox(couleurs);
        c.add(boite);
        boite.addItemListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        int choix = boite.getSelectedIndex();

        switch (choix){

            case 0:
                c.setBackground(new Color(255, 0, 0));
                break;

            case 1:
                c.setBackground(new Color(0, 255,0));
                break;

            case 2:
                c.setBackground(new Color(0, 0, 255));
                break;

            case 3:
                c.setBackground(new Color(208,208,208));
                break;

            default:
                c.setBackground(new Color(255, 255,0));
                break;
        }

    }
}
