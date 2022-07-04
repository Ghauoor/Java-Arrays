package Questions_Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5};
        int[] array = {1,2,4,5};
        System.out.println(isPermutation(arr,array));

    }
    public static boolean isPermutation(int[] arr , int[] array){
        if (arr.length != array.length){
            return false;
        }
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 0;
        int mult2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            sum2 += array[i];

            mult1 *= arr[i];
            mult2 *= array[i];
        }
        if (sum1 == sum2 && mult1 == mult2){
            return true;
        }
        return false;
    }
}
