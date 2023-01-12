package Questions_Arrays;

import java.util.Arrays;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 2, 12, 3, 2, 3, 3, 3};

       // System.out.println(removeDuplicates(arr));
        // removeDuplicate(arr);

        System.out.println(removeDuplicatess(arr));
    }

    public static void removeDuplicate(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];

        System.out.println(Arrays.toString(arr));


    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0 || nums.length == 1)
            return nums.length;

        // To store index of next unique element
        int j = 0;

        //  maintain another updated index i.e. j
        for (int i = 0; i < nums.length-1; i++)
            if (nums[i] != nums[i+1])
                nums[j++] = nums[i];

        nums[j++] = nums[nums.length-1];

        return j;
    }

    public static int removeDuplicatess(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return ++j;

    }
}
