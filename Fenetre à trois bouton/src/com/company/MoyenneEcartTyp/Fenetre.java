package com.company.MoyenneEcartTyp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    private JButton b1, b2, b3;
    private JPanel panneau;
    private JTextField champ;

    public Fenetre(){

        this.setTitle("Tester origine des boutons");
        setSize(250,150);
        Container c = getContentPane();

        panneau = new JPanel();
        c.add(panneau, "West");
        champ = new JTextField();
        c.add(champ);

        Box boxVertical = Box.createVerticalBox();
        panneau.add(boxVertical);

        b1 = new JButton("bouton 1");
        boxVertical.add(b1);
        b1.addActionListener(this);

        b2 = new JButton("bouton 2");
        boxVertical.add(b2);
        b2.addActionListener(this);

        b3 = new JButton("bouton 3");
        boxVertical.add(b3);
        b3.addActionListener(this);

        setLocationRelativeTo(this.getParent());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == b1){
            champ.setText("clic sur le bouton 1");
        }
        else if (e.getSource() == b2){
            champ.setText("clic sur bouton 2");
        }
        else {
            champ.setText("clic sur bouton 3");
        }

            Toolkit.getDefaultToolkit().beep();

    }
}
