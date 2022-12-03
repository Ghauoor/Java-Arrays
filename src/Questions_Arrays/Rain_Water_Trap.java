package Questions_Arrays;

public class Rain_Water_Trap {

    public int trap(int[] arr) {
        int res = 0;
        int left_max = 0;
        int right_max = 0;
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            left_max = Math.max(left_max, arr[i]);
            right_max = Math.max(right_max, arr[j]);
            if (left_max < right_max) {
                res += left_max - arr[i];
                i++;
            } else {
                res += right_max - arr[j];
                j--;
            }
        }
        return res;
    }
}
