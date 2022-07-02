package Questions_Arrays;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,10};

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index, int i1) {
        int temp = arr[index];
        arr[index] = arr[i1];
        arr[i1] = temp;
    }
}
