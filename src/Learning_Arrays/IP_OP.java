package Learning_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IP_OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        // Arrays of Primitives.. ->
        int[] arr = new int[5];
        //Input....
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the Values: ");
            arr[i] = sc.nextInt();
        }
        //Printing
        for (int i = 0; i < arr.length; i++){
            System.out.println(i+": "+arr[i]);
        }

        // Here num represent the element of array... ->

        for (int num:
             arr) {
            System.out.println(num);
        }

        // Printing using Arrays class.... ->
        System.out.print(Arrays.toString(arr));

         */

        // Array of Objects... ->

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
