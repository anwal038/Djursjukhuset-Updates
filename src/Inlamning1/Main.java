package Inlamning1;

import javax.swing.*;

public class Main  {

    public static void main(String[] args) {
        // Skapa objekt av djuren
        Hund h1 = new Hund("Sixten", 5000, "hundfoder");
        Hund h2 = new Hund("Dogge", 10000, "hundfoder");
        Katt k1 = new Katt("Venus", 5000, "kattfoder");
        Katt k2 = new Katt("Ove", 3000, "kattfoder");
        Orm o1 = new Orm("Hypno", 1000, "ormpellets");

        String s = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        if (s.toLowerCase().equals("sixten")) {
            h1.skriv();
        } else if (s.toLowerCase().equals("dogge")) {
            h2.skriv();
        } else if (s.toLowerCase().equals("venus")) {
            k1.skriv();
        } else if (s.toLowerCase().equals("ove")) {
            k2.skriv();
        } else if (s.toLowerCase().equals("hypno")) {
            o1.skriv();
        } else {
            JOptionPane.showMessageDialog(null, "Angivet djur finns inte i registret");
        }
    }





}
