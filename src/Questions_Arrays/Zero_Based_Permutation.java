package Questions_Arrays;

import java.util.Arrays;

public class Zero_Based_Permutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};

        System.out.println(Arrays.toString(buildArray(arr)));

    }
    public static int[] buildArray(int[] arr){
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr[i]];
        }
        return res;
    }
}
