package programmierung1.Arrays;

import java.util.Arrays;

public class ArraysBasicUses {

    public static void a32(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            arr[i]= i + 1;
        for (int num : arr)
            System.out.print(num + " ");
    }
    public static void a33(){
        int[] arr = new int[100];
        outputArray(arr);
        System.out.println();
        insertRandomNumInArray(arr);
        outputArray(arr);
        System.out.println();
        Arrays.sort(arr);
        outputArray(arr);
    }
    public static void outputArray(int[] arr){
        for(int num: arr)
            System.out.print(num + " ");
    }
    public static void insertRandomNumInArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100) + 1;
        }
    }
    public static void a35(){
        float[] masterArray = {1.0f,1.1f,1.2f,1.3f,1.4f};
        float[] copiedArray = new float[3];
        copiedArray = masterArray;
        System.out.print("Arr1: " + masterArray + " Arr2: " + copiedArray);
        copiedArray = Arrays.copyOf(masterArray, 3);
        System.out.print("Arr1: " + masterArray + " Arr2: " + copiedArray);
    }
    public static void a36(){
        char[][] matrix = {
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ' },
                { ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ' },
                { ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ' },
                { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
                { ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ' },
                { ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', ' ', ' ' },
                { ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ' },
                { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
        };
        outputMatrix(matrix);
        invert(matrix);
        outputMatrix(matrix);
    }
    public static void outputMatrix(char[][] arr){
        for(char[] chars:arr){
            for(char c : chars){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void invert(char[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == ' ')
                    arr[i][j] = 'X';
                else
                    arr[i][j] = ' ';
            }
        }
    }
}
