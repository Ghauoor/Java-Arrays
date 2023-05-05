package Questions_Arrays;
//https://practice.geeksforgeeks.org/problems/7d62c8606123a199720c9b6885249dc9ac651bb7/1?page=1&sortBy=submissions&searchQuery=Minimum%20Number
public class Minimum_Number {
    public static int minimumNumber(int n, int[] arr) {
        int ans = 0;
        for (int a : arr) {
            ans = gcd(ans, a);
        }

        return ans;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
