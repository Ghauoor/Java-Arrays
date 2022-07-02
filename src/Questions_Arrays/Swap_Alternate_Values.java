package Questions_Arrays;

import java.util.Arrays;

public class Swap_Alternate_Values {
    public static void main(String[] args) {
        int[] evenArr = {1,2,3,4,5,6};
        int[] oddArr = {2,3,6,8,3};
        System.out.println("The Input Array is: " + Arrays.toString(oddArr));
        int size = oddArr.length;
        int sized = evenArr.length;
        swapTheAlternateValue(oddArr,size);
        System.out.println();
        System.out.println("The Input Array is: " + Arrays.toString(evenArr));
        swapTheAlternateValue(evenArr, sized);



    }
    static void swapTheAlternateValue(int[] arr , int size){
        for (int i = 0; i < arr.length; i+=2) {

            if (i+1 < size){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }

        }
        System.out.println("The output Array is: "+Arrays.toString(arr));
    }

}
