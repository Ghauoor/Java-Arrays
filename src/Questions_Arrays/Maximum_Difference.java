package Questions_Arrays;

public class Maximum_Difference {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        System.out.println(maximumDifference(nums));

    }

    public static int maximumDifference(int[] nums) {
        int diff = -1;
        int min = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > min) {
                diff = Math.max(diff, nums[i] - min);
            }
            min = Math.min(min, nums[i]);
        }
        return diff;
    }
}
