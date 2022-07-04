package Questions_Arrays;

import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,4,3,5};

        int target = 11;

        int[] ans = pairSum(arr, target);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] pairSum(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[] {i , j};
                }
            }

        }
        throw new IllegalArgumentException("No Solution is Found");
    }
}
