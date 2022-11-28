package Algos;

import java.util.Arrays;

public class Suffix_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        suffixSum(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void suffixSum(int[] arr) {
        for (int i = arr.length - 2; i > 0; i--) {
            arr[i] += arr[i + 1];
        }
    }
}
