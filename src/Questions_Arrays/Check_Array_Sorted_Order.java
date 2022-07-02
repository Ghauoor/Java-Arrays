package Questions_Arrays;

import java.util.Scanner;

public class Check_Array_Sorted_Order {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAccending = true;

        //Termination Loop -->

        for (int i = 0; i < arr.length - 1; i++) {
            //for decending order
            if (arr[i] > arr[i + 1]) {

                isAccending = false;
                break;
            }
        }
        if (isAccending)
            System.out.println("Array is sorted in asceding order");
        else
            System.out.println("Array is not Sorted");
    }
}
