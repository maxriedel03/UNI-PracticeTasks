package programmierung1.testate;

import java.util.Scanner;

public class Benzinverbrauch {
    public static void main(String[] args){
        final double DVA = 5.4d;
        final double DVB = 9.8d;
        final double TAGE = 365d;
        final double MAXKM = 120d * 8d;

        double kmA;
        double kmB;
        double bVA;
        double bVB;


        Scanner sc = new Scanner(System.in);

        //System.out.println("Gefahrene Kilometer pro Tag Auto A:");
        kmA = sc.nextDouble();

        //System.out.println("Gefahrene Kilometer pro Tag Auto B:");
        kmB = sc.nextDouble();

        if(kmA > 0d && kmB > 0d && kmA <= MAXKM && kmB <= MAXKM){
            bVA = DVA * kmA/100 * TAGE;
            bVB = DVB * kmB/100 * TAGE;

            System.out.println("Verbrauch A im Jahr: " + bVA + " Liter");
            System.out.println("Verbrauch B im Jahr: " + bVB + " Liter");
        }else{
            System.out.println("Eingabefehler");
        }
        sc.close();
    }
}
