package com.company.MoyenneEcartTyp;

import java.awt.*;

public class Bouton extends javax.swing.JButton{

    private String name;
    public  Bouton(String str){
        super(str);
        this.name = str;
    }

    public void paintComponent(Graphics g){

        Graphics2D g2d = (Graphics2D)g;
        GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 0, Color.cyan);
        g2d.setPaint(gp);
        g2d.fillRect(0,0, this.getWidth(),this.getHeight());
        g2d.setColor(Color.white);
        g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 / 4), (this.getHeight() / 2) + 5);
    }
}
