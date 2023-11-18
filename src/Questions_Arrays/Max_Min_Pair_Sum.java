package Questions_Arrays;

import java.util.Arrays;
// https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
public class Max_Min_Pair_Sum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            int j = nums.length - 1 - i;
            max = Math.max(max, nums[i] + nums[j]);
        }
        return max;
    }
}
