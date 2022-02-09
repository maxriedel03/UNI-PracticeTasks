package algodat;

import java.util.Scanner;

public class OtherImplementations {
    static int count = 0;
    public static void main (String[] args){
        int[] testArr = new int[]{1,2,5,878,34,2323,4555,34,23,45,768,8686, 98, 818, 99999};
        System.out.println(searchMax(testArr, 0, testArr.length - 1));
        System.out.println(count);
    }
    public static int searchMax(int[] a, int left, int right){
        if(left < right){
            int mid = (left+right)/2;
            int x = searchMax(a, left, mid);
            int y = searchMax(a, mid +1, right);
            count++;
            return Math.max(x, y);
        }else{
            return a[left];
        }
    }
    public static void ratemal(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() > 0){
            ratemal();
            System.out.println(s);
        }
    }
    public static String aufundab(int x, int y){
        String s = "";
        if(x != y) {
            s += x + " ";
            s += aufundab(x + 1, y);
        }
        return s += x + " ";
    }
    public static void aufundab2(int x, int y){
        if(x == y)
            System.out.println(x);
        else{
            System.out.println(x);
            aufundab2(x + 1, y);
            System.out.println(x);
        }
    }
    public static boolean e (int x){
        if (x == 0)
            return true;
        else
            return e(x -1);
    }
    public static boolean o (int x){
        if (x == 0)
            return false;
        else
            return o(x -1 );
    }
    public static int function(int n){
        if (n <= 1)
            return 0;
        else{
            return function(n-2) +1;
        }
    }
    public static int binSearch(int[] a, int unten, int oben, int x){
        int mitte = (unten+oben)/2;
        if(x == a[mitte])
            return mitte;
        else if (unten >= oben)
            return -1;
        else if(x < a[mitte])
            return binSearch(a, unten, mitte - 1, x);
        else
            return binSearch(a, mitte + 1, oben, x);
    }
}
