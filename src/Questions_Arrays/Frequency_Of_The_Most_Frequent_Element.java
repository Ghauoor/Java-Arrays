package Questions_Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
public class Frequency_Of_The_Most_Frequent_Element {
    long[] preSum;

    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        preSum = new long[n + 1];
        for (int i = 0; i < n; i++)
            preSum[i + 1] = preSum[i] + nums[i];

        int ans = 0;
        for (int i = 0; i < n; i++)
            ans = Math.max(ans, count(nums, k, i));
        return ans;
    }

    long getSum(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }

    int count(int[] nums, int k, int index) {
        int left = 0, right = index, res = index;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long s = getSum(mid, index - 1);
            if (s + k >= (long) (index - mid) * nums[index]) { // expacted Ans
                res = mid; // save best answer so far
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index - res + 1;
    }
}
