package programmierung1.Methods;

import java.util.Scanner;

public class MethodsBasicUses {
    //Aufgabe 30

    public static void dice(){
        int wurfel1;
        int wurfel2;
        int wurf;
        boolean pasch;

        wurfel1 = random()%6 + 1;
        wurfel2 = random()%6 + 1;
        wurf = 0;
        pasch = false;

        System.out.println("Wurf: " + wurf + " - " + wurfel1 + ":" + wurfel2);

        for(int i = wurf + 1; i <4 && !pasch; i++){
            wurfel1 = (int)(Math.random()*6 + 1);
            wurfel2 = (int)(Math.random()*6 + 1);
            System.out.println("Wurf: " + i + " - " + wurfel1 + ":" + wurfel2);
            if(wurfel1 == wurfel2){
                System.out.println("PASCH!");
                pasch = true;
            }
        }
    }


    private static long xk = System.currentTimeMillis();

    public static int random(){
        long m = Integer.MAX_VALUE;
        long a = 167323;
        long c = 1;

        int x = (int)((a * xk + c)%m);
        xk = x;
        return x;
    }

    //Aufgabe 31

    public static void test31(){
        convertHorn();
    }

    public static void convertHorn(){
        Scanner sc = new Scanner(System.in);

        int base;
        String input;
        int solution;
        int stringSize;
        char tempValue;

        System.out.println("Gewünschte Zahl:");
        input = sc.next();
        stringSize = input.length();
        System.out.println("Basis: ");
        base = sc.nextInt();

        input = input.toUpperCase().replace(" ", "");

        solution = 0;

        for(int i = stringSize - 1, count = 0; i >= 0; i--, count++){
            tempValue = input.charAt(i);
            if (tempValue >= 48 && tempValue <= 57){
                solution += (tempValue - 48) * Math.pow(base, count);
            }else if(tempValue >= 65 && tempValue <= 90){
                solution += (tempValue - 55) * Math.pow(base, count);
            }
        }

        System.out.println("Lösung: " + solution);
    }

    //Aufgabe 28

    public static void test28(){
    }

    public static int fibonacciRe(int folgenIndex){
        int result;
        result = 0;
        switch(folgenIndex){
            case 1:
            case 2:
                result = 1;
                break;
            default:
                result += fibonacciRe(folgenIndex -1) + fibonacciRe(folgenIndex -2);
        }
        return result;
    }

    public static int fibonacciIt(int folgenIndex){
        int fib;
        int prevFib;
        int temp;
        if(folgenIndex <= 1) {
            fib = folgenIndex;
        }else{
            fib = 1;
            prevFib = 1;
            for(int i=2; i<folgenIndex; i++) {
                temp = fib;
                fib+= prevFib;
                prevFib = temp;
            }
        }
        return fib;
    }

    //Aufgabe 27

    public static void test27(){
    }

    public static int itNextPrime(int num){
        boolean primeFound;
        do {
            num++;
            primeFound =  berechnePrimzahl(num);
        }while (!primeFound);
        System.out.println(num);
        return num;
    }

    public static boolean berechnePrimzahl(int num){
        boolean istPrimzahl;
        int div;
        if(num > 2){
            div = 2;
            istPrimzahl = true;
            do {
                if(num%2 == 0){
                    istPrimzahl = true;
                }
                div++;
            }while (istPrimzahl && div < Math.sqrt(num));
        }else {
            if(num == 2)
                istPrimzahl = true;
            else
                istPrimzahl = false;
        }
        return istPrimzahl;
    }

    //Aufgabe 26

    public static void test26(){
        potenztaschenrechner();
    }

    public static void potenztaschenrechner(){
        Scanner sc = new Scanner(System.in);
        int base;
        int exp;
        int result;
        System.out.println("Basis: ");
        base = sc.nextInt();
        System.out.println("Exponent: ");
        exp = sc.nextInt();
        result = pow(base, exp);
        System.out.println(Math.pow(base, exp));
        System.out.println("Result: " + result);
    }

    public static int pow(int base, int exp){
        boolean neg;
        boolean odd;
        int potenz;
        odd = false;
        if(exp == 0)
            potenz = 1;
        else if(base == 0)
            potenz = 0;
        else{
            if(base < 0){
                neg = true;
                base -= base + base;
            }else
                neg = false;
            if(exp%2 == 1)
                odd = true;
            potenz = base;
            for(int i = 1; i < exp; i++){
                potenz = mult(potenz, base);
            }
            if(neg && odd){
                potenz -= potenz + potenz;
            }
        }
        return potenz;
    }
    public static int mult(int base, int factor){
        int result;
        result = 0;
        for(int i = 0; i < factor; i++)
            result += base;
        return result;
    }

    //Aufgabe 25

    public static void test25(){

    }

    public static double max(double x, double y){
        double max;
        if(x > y)
            max = x;
        else
            max = y;
        return max;
    }

    public static char max(char x, char y){
        char max;
        if(x > y)
            max = x;
        else
            max = y;
        return max;
    }
}
