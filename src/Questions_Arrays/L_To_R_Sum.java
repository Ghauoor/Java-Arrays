package Questions_Arrays;

public class L_To_R_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int leftIndex = 2;
        int rightIndex = 4;

        System.out.println(querySum(arr, leftIndex, rightIndex));
    }

    static void prefixSumLToR(int[] arr) {


        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

    }

    static int querySum(int[] arr, int leftIndex, int rightIndex) {
        prefixSumLToR(arr);
        int ans = arr[rightIndex] - arr[leftIndex - 1];

        return ans;
    }


}
