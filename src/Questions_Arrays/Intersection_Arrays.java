package Questions_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 33, 4, 5, 6, 6, 4, 3, 4, 5};
        int[] arr2 = {3, 55, 3, 4, 6, 2, 11, 1, 10};

        int[] res = intersection(arr1, arr2);

        System.out.println(Arrays.toString(res));

    }
    //TODO: This method is not working for now .. --->
    static void findArrayIntersection(int[] arr, int n, int[] arr2, int m){

        int i = 0;
        int j = 0;
        ArrayList<Integer> array = null;
        while (i < n && j < m){
            if (arr[i] == arr2[j]){

                array.add(arr[i]);
                i++;
                j++;

            } else if (arr[i] < arr2[j]){
                i++;
            } else {
                j++;
            }
        }
        System.out.println(array);


    }

    public static int[] intersection(int[] a, int[] b) {
        return Arrays.stream(a)
                .distinct()
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
                .toArray();
    }
}
