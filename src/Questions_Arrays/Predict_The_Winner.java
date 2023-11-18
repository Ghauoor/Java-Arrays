package Questions_Arrays;

public class Predict_The_Winner {
    private static int game(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }

        int chooseStart = nums[start] - game(nums, start + 1, end);
        int chooseEnd = nums[end] - game(nums, start, end - 1);

        return Math.max(chooseStart, chooseEnd);
    }

    public boolean predictTheWinner(int[] nums) {
        return game(nums, 0, nums.length - 1) >= 0;
    }
}
