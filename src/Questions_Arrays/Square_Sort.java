package Questions_Arrays;

import java.util.Arrays;

public class Square_Sort {
    public static void main(String[] args) {
        int[] arr = {-10, -5, -2, 1, 2, 9};
        System.out.println(Arrays.toString(sortSquare(arr)));
    }

    static int[] sortSquare(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int[] ans = new int[arr.length];

        int k = 0;

        while (start <= end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                ans[k++] = arr[start] * arr[start];
                start++;
            } else {
                ans[k++] = arr[end] * arr[end];
                end--;
            }

        }

        return ans;
    }
}
