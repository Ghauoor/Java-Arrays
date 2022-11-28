package Questions_Arrays;

import java.util.Arrays;

public class Prefix_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5};

        prefix(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Real Array: " + Arrays.toString(arr));

        System.out.println("PrefixSum  Array: " + Arrays.toString(prefixSum(arr)));
    }

    static int[] prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];


        for (int i = 1; i < arr.length; i++) {

            prefixSum[i] = prefixSum[i - 1] + arr[i];

        }
        return prefixSum;

    }

    static void prefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
    }
}
