package Questions_Arrays;

public class Frequency_Of_Digits {
    public static void main(String[] args) {

        int n = 12001;
        checkFrequency(n);
    }

    static void checkFrequency(int n) {
        int[] arr = new int[10];

        while (n != 0) {
            int lDigit = n % 10;
            arr[lDigit]++;
            n = n / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + " : " + arr[i]);
            }
        }
    }
}
