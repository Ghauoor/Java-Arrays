package Questions_Arrays;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void moveZeroes(int[] arr) {
        int nonZero = 0;

        for (int j = 0; j < arr.length; j++){
            if(arr[j] != 0){
                swap(arr, j, nonZero);
                nonZero++;
            }
        }

    }
   static void swap(int[] arr,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
