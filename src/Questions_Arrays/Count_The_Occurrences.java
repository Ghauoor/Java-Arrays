package Questions_Arrays;


public class Count_The_Occurrences {
    public static void main(String[] args) {
        int[] arr = {1,22,3,3,3,4,5,6,7,5,3,4,5,-3};
        int n = 3;
        System.out.println(numOfOccur(arr, n));
    }
    static int numOfOccur(int[]arr, int n){
        int res = 0;
        for (int j : arr) {
            if (j == n) {
                res++;
            }
        }
        return res;
    }

}
