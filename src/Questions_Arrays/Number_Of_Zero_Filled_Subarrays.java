package Questions_Arrays;
//https://leetcode.com/problems/number-of-zero-filled-subarrays/description/
public class Number_Of_Zero_Filled_Subarrays {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int i = 0;
        int n = nums.length;

        while (i < n) {
            long len = 0;
            if (nums[i] == 0) {
                //find the len of subarray
                while (i < n && nums[i] == 0) {
                    i++;
                    len++;
                }
            } else {
                i++;
            }
            result += (len) * (len + 1) / 2;
        }
        return result;
    }
}
