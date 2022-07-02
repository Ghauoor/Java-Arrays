package Learning_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multi_Dimentional_Arrays {
    public static void main(String[] args) {
        /*
        1  2  3
        4  5  6
        7  8  9

        int arr [3] [3];
        Must give the row value...
        int [][] = {

           {1,  2,  3},
           {4,  5,  6},
           {7,  8,  9}
        }
          int arr2D [][] = {

            {1,  2,  3}, 0th index,
            {4,  5}, 1st index...
            {6,  7,  8,  9} 2nd index..

            arr2D[2] = {6,  7,  8,  9} --> 6... ans...

            arr.length give the no of rows in 2Darray
        };

        i/p and o/p in this 2DArrays
          //input
        int[][] newArr = new int[3][3];

        for (int row = 0; row < newArr.length; row++){
            //for each column in every row
            for (int col = 0; col < newArr[row].length; col++) {
                newArr[row][col] = sc.nextInt();

            }
        }

        //Output
        --->
        for (int row = 0; row < newArr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
            System.out.println();
        }

        for (int[] a:
             newArr) {
            System.out.println(Arrays.toString(a));
            System.out.println();
        }

        System.out.println(Arrays.deepToString(newArr)
                .replace("],","\n").replace(",","\t| ")
                .replaceAll("[\\[\\]]", " "));

         */

        Scanner sc = new Scanner(System.in);
//
//        int[][] arr = {
//
//            {1,  2,  3},
//            {4,  5,  6},
//            {7,  8,  9}
//        };
//
//        int[][] arr2D = {
//
//            {1,  2,  3},//0th index,
//            {4,  5},// 1st index...
//            {6,  7,  8,  9}//2nd index..
//        };
//        for (int i = 0; i < arr2D.length; i++) {
//            for (int column = 0; column < arr2D[i].length; column++) {
//                System.out.print(arr2D[i][column] + " ");
//            }
//            System.out.println();
//        }
        //input
//        int[][] newArr = new int[3][];
//
//        for (int row = 0; row < newArr.length; row++){
//            //for each column in every row
//            for (int col = 0; col < newArr[row].length; col++) {
//                newArr[row][col] = sc.nextInt();
//
//            }
//        }
//        System.out.print("\nData you entered : \n");
        //Output
//        for (int row = 0; row < newArr.length; row++){
//            //for each column in every row
//            for (int col = 0; col < newArr[row].length; col++) {
//                System.out.print(newArr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int row = 0; row < newArr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < newArr[row].length; col++) {
//                System.out.print(newArr[row][col] + " ");
//            }
//            System.out.println();
//        }
//         output
//        for (int row = 0; row < newArr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }

//        for (int[] a:
//             newArr) {
//            System.out.println(Arrays.toString(a));
//
//        }
//
//        System.out.println(Arrays.deepToString(newArr)
//                .replace("],","\n").replace(",","\t| ")
//                .replaceAll("[\\[\\]]", " "));

        int[][] newArr = new int[3][3];

        for (int row = 0; row < newArr.length; row++){
            //for each column in every row
            for (int col = 0; col < newArr[row].length; col++) {
                newArr[row][col] = sc.nextInt();

            }
        }
        for (int[] a:
                newArr) {
            System.out.println(Arrays.toString(a));
            System.out.println();
        }





    }
}
