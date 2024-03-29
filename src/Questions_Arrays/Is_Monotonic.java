package Questions_Arrays;

public class Is_Monotonic {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < nums.length - 1; i++) {
            // check for increment of Array
            if (nums[i] > nums[i + 1]) {
                inc = false;
            }
            // Check for decrement of Array
            if (nums[i] < nums[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
}
