package Questions_Arrays;

import java.util.ArrayList;

public class FInd_Duplicates {
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 4, 7, 1, 3, 6};

        int[] array = {8, 1, 4, 2, 6, 5, 5, 7, 3};

        int res = findDuplicate(arr);
        int result = findDuplicate(array);

        System.out.println(res);
        System.out.println(result);

    }
    static int findDuplicate (int[] arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            
        }
        //XOR [1, n-1]
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ i;
        }
        return ans;
    }
    public static int findDuplicate(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++){
            ans = ans ^ arr.get(i);
        }

        for (int i = 0; i < arr.size(); i++){
            ans = ans ^ i;
        }
        return ans;

    }
}
