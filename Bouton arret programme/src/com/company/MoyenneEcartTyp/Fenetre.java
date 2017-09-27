package com.company.MoyenneEcartTyp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener{

    JButton bouton;
    public Fenetre(){

        this.setTitle("Arrete programme");
        this.setSize(200,200);
        Container c = getContentPane();
        bouton = new JButton("Fermer");
        c.add(bouton, "South");
        bouton.addActionListener(this);
        this.setLocationRelativeTo(this.getParent());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
