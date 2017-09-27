package com.company.MoyenneEcartTyp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Fenetre extends JFrame implements MouseListener{

    private static int clics;
    private JLabel etiket;
    public Fenetre(){

        this.setTitle("Nombre de clic sur la fenetre");
        this.setSize(400, 150);
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        etiket = new JLabel();
        c.add(etiket);
        addMouseListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

        clics++;
        etiket.setText("Nombre de clics = " + clics);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
