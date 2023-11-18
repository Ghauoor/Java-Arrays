package Questions_Arrays;

// https://leetcode.com/problems/concatenation-of-array/description/

public class Concatenation_Of_Array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }
}
