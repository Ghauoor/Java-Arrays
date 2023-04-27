package Matrices_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flatten_A_N_Dimention_Array {
    public static void main(String args[]) {

        //declare and initialize the 2D array that needs to be flattened
        Integer[][] arr = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}
        };
        //declare a list that contain streams
        List<Integer> streamList = new ArrayList<>();

        //for each loop to convert array in arr to stream and add the stream to streamList
        for (Integer[] array : arr) {
            Arrays.stream(array)
                    .forEach(streamList::add);
        }

        //flatten the stream using toArray method
        Integer[] flattenArray = streamList.stream().toArray(Integer[]::new);

        //print the flattened arrays
        System.out.println("Input: " + Arrays.deepToString(arr));
        System.out.println("Output: " + Arrays.toString(flattenArray));
    }
}



