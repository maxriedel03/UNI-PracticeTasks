package programmierung1.testate.GPS;

public class GPSEmpfangTesttreiber {
    public static void main(String[] args){
        int[] testArr = new int[4];
        int[] testArr2 = {81, 90, 110};

        GPSEmpfang.ausgeben(null);

        GPSEmpfang.ausgeben(testArr2);

        GPSEmpfang.einlesenLaufzeiten(testArr);
        GPSEmpfang.ausgeben(testArr);
    }
}
