package Questions_Arrays;

public class Missing_Number {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20};

        int n = arr.length;

      //  int miss = getMissingNumber(arr, n);
        int a = 1;
        n(arr);

       // System.out.println(miss);
    }
    static int getMissingNumber(int[] arr, int n){
            int sumOfNumber = n * (n + 1) / 2;
            int result = 0;

        for (int i = 0; i < n - 1; i++) {

            result = result + arr[i];

        }
        return sumOfNumber - result;
    }
    static void n (int[] arr){
        int a = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a){
                a = a + 1;
            }
        }
        System.out.println(a);

    }
}
