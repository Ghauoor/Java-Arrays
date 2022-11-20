package Questions_Arrays;

import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};

        System.out.println(Arrays.toString(sortArrayByParity(arr)));

    }

    public static int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] % 2 == 0) {
                start++;
            } else {
                int tmp = nums[end];
                nums[end--] = nums[start];
                nums[start] = tmp;
            }
        }
        return nums;
    }
}
