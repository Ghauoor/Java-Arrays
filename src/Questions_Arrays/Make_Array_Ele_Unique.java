package Questions_Arrays;

import java.util.Arrays;

public class Make_Array_Ele_Unique {
    public int minIncrements(int[] arr, int n) {
        Arrays.sort(arr);

        int ans = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                while (arr[i] >= arr[i + 1]) {
                    arr[i + 1] = arr[i + 1] + 1;
                    ans++;
                }
            }
        }

        return ans;
    }
}
