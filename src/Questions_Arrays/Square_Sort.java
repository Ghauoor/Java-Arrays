package Questions_Arrays;

import java.util.Arrays;

public class Square_Sort {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 1, 2, 9};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    static public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int start = 0, end = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                result[p] = arr[start] * arr[start];
                start++;
            } else {
                result[p] = arr[end] * arr[end];
                end--;
            }
        }
        return result;
    }
}




