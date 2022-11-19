package Algos;

public class Kadanes_Algorithm {
    public static void main(String[] args) {

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        maxSumArray(arr);

    }

    static void maxSumArray(int[] arr) {

        int maxSum = 0;
        int curSum = 0;
        int start = 0, s = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum = curSum + arr[i];

            if (curSum > maxSum) {
                maxSum = curSum;
                start = s;
                end = i;

            }

            if (curSum < 0) {
                curSum = 0;
                s = i + 1;
            }
        }

        System.out.println("Maximum contiguous sum is "
                + maxSum);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
}
