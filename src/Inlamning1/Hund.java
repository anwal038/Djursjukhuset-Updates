package Inlamning1;

import javax.swing.*;

public class Hund extends Djur  {
   // Instansvariabel
    protected String foder;

    // Konstruktor
    public Hund(String namn, double vikt, String foder) {
        super(namn, vikt);
        this.foder = foder;
    }

    // Mängd foder metod
   public double mängdHundMat() {
        return  getVikt() / 100;
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
        JOptionPane.showMessageDialog(null,  getNamn() + " ska ha " + mängdHundMat() + " gram " + getFoder());
    }
}
