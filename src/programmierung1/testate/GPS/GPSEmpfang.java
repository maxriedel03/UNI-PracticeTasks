package programmierung1.testate.GPS;

import java.util.Scanner;

public class GPSEmpfang {
    public static void einlesenLaufzeiten(int[] laufzeiten){
        if(laufzeiten != null){
            Scanner sc = new Scanner(System.in);

            int arrLen;
            boolean stopEntry;
            int nextIndex;
            int inputValue;

            arrLen = laufzeiten.length;
            stopEntry = false;
            nextIndex = 0;

            while(!stopEntry && nextIndex < arrLen){
                inputValue = sc.nextInt();
                if(inputValue == -1){
                    stopEntry = true;
                }else if(inputValue >= 80 && inputValue <= 130){
                    laufzeiten[nextIndex] = inputValue;
                    nextIndex++;
                }
            }
            sc.close();
        }
    }
    public static void ausgeben(int[] laufzeiten){
        if(laufzeiten != null){
            for (int i = 0; i < laufzeiten.length; i++){
                System.out.println("Laufzeit: " + laufzeiten[i] + " ms");
            }
        }
    }
}
