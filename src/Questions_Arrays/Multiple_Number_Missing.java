package Questions_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multiple_Number_Missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,11};



    }
    static List<Integer> missingNumber(int[] arr){
        int i = 0;
        int n = arr.length;

        while (i < n){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            } else
                i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (arr[index] != index+1)
                ans.add(index+1);
        }
        return  ans;
    }

    static void swap (int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
