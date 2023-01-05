package Questions_Arrays;

import java.util.Arrays;

public class Max_Product_Value {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int maxOne = (arr[0] * arr[1] * arr[n - 1]);
        int maxTwo = (arr[n - 1] * arr[n - 2] * arr[n - 3]);

        return Math.max(maxOne, maxTwo);

    }
}
