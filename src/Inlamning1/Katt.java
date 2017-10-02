package Inlamning1;

import javax.swing.*;

public class Katt extends Djur implements  printMe{
    protected String foder;

    // Konstruktor
    public Katt(String namn, double vikt, String foder) {
        super(namn, vikt);
        this.foder = foder;
    }

    // Mängd foder metod
    public double mängdKattfoder() {
        return getVikt() / 150;
    }

    // Getters & Setters
    public String getFoder() {
        return foder;
    }

    public void setFoder(String foder) {
        this.foder = foder;
    }

    @Override
    public void skriv() {
        JOptionPane.showMessageDialog(null, String.format( getNamn() + " ska ha " +
                 + mängdKattfoder() + " gram " + getFoder()));
    }


}
