package Inlamning1;

import javax.swing.*;

public class Djur implements printMe{
    // Instansvariabler
    protected String namn;
    protected double vikt;

    // default konstruktor
    public Djur() {

    }

     // Konstruktor
    public Djur(String namn, double vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    // Getters & Setters
    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }

    @Override
    public void skriv() {
       JOptionPane.showMessageDialog(null, "Ett djur vid namn " + getNamn() + " som väger " + getVikt());
    }


}
