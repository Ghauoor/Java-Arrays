package Questions_Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,4,2};

        int [] arr1 = {1,2,3,4,5};

        swap(arr, 0 , 2);
        swap(arr1,0,3);

        System.out.println(Arrays.toString(arr1));

    }

    private static void swap(int[] arr, int index, int i1) {
        int temp = arr[index];
        arr[index] = arr[i1];
        arr[i1] = temp;
    }
}
