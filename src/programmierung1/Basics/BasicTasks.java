package programmierung1.Basics;

import java.util.Scanner;

public class BasicTasks {
    //Aufgabe 19

    public static void euklid(){
        int number1;
        int number2;
        int rest;
        Scanner sc = new Scanner(System.in);

        System.out.println("number1: ");
        number1 = sc.nextInt();
        System.out.println("number2: ");
        number2 = sc.nextInt();

        rest = number1%number2;

        while(rest != 0){
            number1 = number2;
            number2 = rest;
            rest = number1%number2;
        }
        System.out.println(number2);
        sc.close();
    }

    //Aufgabe 18

    public static  void bananenrechner (){

        //einlesen

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Brutto-Kilopreis von Bananen in Cent ein: ");
        int banana = sc.nextInt();
        System.out.println("Bitte geben Sie das Gewicht der Bananen in Gramm ein: ");
        int mass = sc.nextInt();
        System.out.println("Bitte geben Sie die Mehrwertsteuer in Prozent ein: ");
        int mwst = sc.nextInt();

        //Berechnung

        if(banana > 0 && mass > 0 && mwst > 0){
            float bruttoR = ((float)banana * ((float)mass/1000f));
            float mwstR =(bruttoR / (1+ (float) mwst /100f));
            float nettoR =(bruttoR - mwstR);

            //Ausgabe

            System.out.println("Brutto: " + (Math.round(bruttoR) / 100f));
            System.out.println("MWst: " + (Math.round(mwstR) / 100f));
            System.out.println("Netto: " + (Math.round(nettoR) / 100f));
            if ((bruttoR - 10) > 0){
                System.out.println("Gratisbananen: " + (int)((bruttoR/100 - 10) / 5) + 1);
            }else{
                System.out.println("Gratisbananen: 0");
            }
        }else{
            System.out.println("error");
        }
    }

    //Aufgabe 17

    public static void mensaessen(){
        Scanner sc = new Scanner(System.in);
        int choose;
        String essen1;
        String essen2;
        String essen3;
        String essen4;

        essen1 = "Hänchenbruststreifen1";
        essen2 = "Hänchenbruststreifen2";
        essen3 = "Hänchenbruststreifen3";
        essen4 = "Hänchenbruststreifen4";

        choose = sc.nextInt();

        switch (choose){
            case 1:
                System.out.println(essen1);
                break;
            case 2:
                System.out.println(essen2);
                break;
            case 3:
                System.out.println(essen3);
                break;
            case 4:
                System.out.println(essen4);
                break;
            default:
                System.out.println("Das essen gibt es nicht");
        }
    }

    //Aufgabe 16

    public static void schaltjahr(){
        Scanner sc = new Scanner(System.in);
        int jahr;

        jahr = sc.nextInt();

        if((jahr > 0 && (jahr%4) == 0 && (jahr%100) != 0) || ((jahr%400) == 0 && jahr > 0))
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr!");
        else
            System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
    }

    //Aufgabe 15

    public static void uberlauf (){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        x = sc.nextInt();
        y = sc.nextInt();

        if(x > 0 && y > 0 && x < (Integer.MAX_VALUE - y)){
            System.out.println("Result: " + (x + y));
        }else{
            System.out.println("Error");
        }
        sc.close();
    }

    //Test Testat

    public static void Zinsberechnung(){
        Scanner sc = new Scanner(System.in);
        float anfangskapital;
        float endkapital;
        float zins;
        float zinssatz;
        int laufzeit;


        System.out.println("Bitte geben Sie ihr Anfangsjapital in Euro ein: ");
        anfangskapital = sc.nextFloat();
        System.out.println("Bitte geben sie die Laufzeit in ganzen Jahren ein: ");
        laufzeit = sc.nextInt();
        System.out.println("Bitte geben sie den Zinssatz in Prozent ein: ");
        zinssatz = sc.nextFloat();
        if(zinssatz < 10 && laufzeit >= 1){
            zins =  zinssatz /100 ;
            endkapital = anfangskapital * (laufzeit * zins + 1);
            System.out.println("Ihr Endkapital beträgt: " + endkapital);
        }else
            System.out.println("Eingabefehler");
        sc.close();
    }

    //Aufgabe 22 - Farbraum -> siehe Eclipse

    //Aufgabe 21 - nextPrime

    public static void nextPrime(){
        Scanner sc = new Scanner(System.in);
        int num;
        int divisor;
        boolean prime;
        int division;

        num = sc.nextInt();
        prime = false;
        do{
            num++;
            divisor = 2;
            prime = true;
            do{
                division = num/divisor;
                if(division*divisor == num)
                    prime = false;
                divisor++;
            }while(!prime && divisor < Math.sqrt(num));
        }while (!prime);

        System.out.println("Lösung: " + num);
    }

    //Aufgabe 20 - Ziffernsumme

    public static long Ziffernsumme(long x){
        long result = 0;
        long divisor = 10;
        while (x != 0) {
            long temp = x % divisor;
            result += temp * 10 / divisor;
            x -= temp;
            x /= 10;
        }
        return result;
    }
}
