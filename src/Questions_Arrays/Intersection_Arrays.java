package Questions_Arrays;

import java.util.Arrays;




public class Intersection_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 33, 4, 5, 6, 6, 4, 3, 4, 5};
        int[] arr2 = {3, 55, 3, 4, 6, 2, 11, 1, 10};

        int[] res = intersection(arr1, arr2);

        System.out.println(Arrays.toString(res));


    }

    public static int[] intersection(int[] a, int[] b) {
        return Arrays.stream(a)
                .distinct()
                .filter(x -> Arrays.stream(b).anyMatch(y -> y == x))
                .toArray();
    }
}
