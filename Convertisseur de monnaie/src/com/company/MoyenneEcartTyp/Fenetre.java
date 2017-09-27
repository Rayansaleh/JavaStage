package com.company.MoyenneEcartTyp;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Fenetre extends JFrame implements DocumentListener{

    private JLabel etiket1;
    private JLabel etiket2;
    private JTextField champ1;
    private JTextField champ2;


    public Fenetre(){
        this.setTitle("Convertisseur de monnaies");
        this.setSize(500, 100);
        Container c = getContentPane();
        c.setLayout( new FlowLayout());
        etiket1 = new JLabel("Euros");
        c.add(etiket1);
        champ1 = new JTextField(15);
        c.add(champ1);
        etiket2 = new JLabel("Francs");
        c.add(etiket2);
        champ2 = new JTextField(15);
        champ2.setEditable(false);
        c.add(champ2);
        champ1.getDocument().addDocumentListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public boolean estUnNombre(String chaine){
        try{
            Double.parseDouble(chaine);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
    @Override
    public void insertUpdate(DocumentEvent e) {

        String texte = champ1.getText();

        if(estUnNombre(texte)){
            double euros = Double.parseDouble(texte);
            double francs = euros * 6.56;
            String conversion = "" + francs;
            champ2.setText(conversion);
        }
        else{
            JOptionPane.showMessageDialog(this, "Ce caractere n'est pas un nombre");

        }

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

        String texte = champ1.getText();
        double euros = Double.parseDouble(texte);
        double francs = euros * 6.56;
        String conversion = "" + francs;
        champ2.setText(conversion);

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
