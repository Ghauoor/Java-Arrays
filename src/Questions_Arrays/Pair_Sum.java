package Questions_Arrays;

import java.util.Arrays;

public class Pair_Sum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,4,3,5};

        int target = 11;

        int[] ans = pairSum(arr, target);
        System.out.println(Arrays.toString(ans));

        System.out.println();

        int array[] = {11, 15, 6, 8, 9,8,8, 10};
        int sum = 16;
        int n = array.length;

        if (pairInSortedRotated(array, n, sum))
            System.out.print("Array has two elements" +
                    " with sum 16");
        else
            System.out.print("Array doesn't have two" +
                    " elements with sum 16 ");
    }
    static int[] pairSum(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    return new int[] {i , j};
                }
            }

        }
        throw new IllegalArgumentException("No Solution is Found");
    }
    static boolean pairInSortedRotated(int arr[],
                                       int n, int x)
    {
        // Find the pivot element
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i+1])
                break;

        // l is now index of smallest element
        int l = (i + 1) % n;


        // r is now index of largest element
        int r = i;

        // Keep moving either l or r till they meet
        while (l != r)
        {
            // If we find a pair with sum x, we
            // return true
            if (arr[l] + arr[r] == x)
                return true;

            // If current pair sum is less, move
            // to the higher sum
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;

            else  // Move to the lower sum side
                r = (n + r - 1) % n;
        }
        return false;
    }
}
