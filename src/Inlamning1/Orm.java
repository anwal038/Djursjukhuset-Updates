package Inlamning1;

import javax.swing.*;

public class Orm extends Djur implements printMe{
    protected String foder;

    // Konstruktor
    public Orm(String namn, double vikt, String foder) {
        super(namn, vikt);
        this.foder = foder;
    }

    // mängden ormfoder
    public final int MÄNGDORMFODER = 20;


    // Getters & Setters
    public String getFoder() {
        return foder;
    }
     public void setFoder(String foder) {

        this.foder = foder;
    }

    @Override
    public void skriv() {
        JOptionPane.showMessageDialog(null,  getNamn() + " ska ha " + MÄNGDORMFODER + " gram " + getFoder());
    }





}
