package company;

import java.util.Scanner;

public class Lampe {
    Scanner selected = new Scanner(System.in);
    private boolean slukket;
    static private int antalLamper;
    private int antalTryk;
    private String lampeNavn;
    private String status;




    public Lampe(boolean slukket) {
        this.slukket = slukket;
        antalLamper++;
    }

    public Lampe(String lampeNavn) {
        this.lampeNavn=lampeNavn;
        antalLamper++;

    }

    public void trykPåKontakt() {
        if (slukket) {
            slukket = false;
        } else {
            slukket = true;
        }
        antalTryk++;
    }

    public static int getAntalLamper() {
        return antalLamper;
    }

    public int getAntalTryk() {
        return antalTryk;
    }

    public boolean isSlukket() {
        return slukket;
    }



    public void trykPåKontakt (Lampe selected) {
        if (slukket) {
            slukket = false;
        } else {
            slukket = true;
        }
    }

    @Override
    public String toString() {
        if (slukket==false){
                status = " slukket";}
                else {
                    status = " tændt";}
       return lampeNavn + " er"+ status;
    }
}



