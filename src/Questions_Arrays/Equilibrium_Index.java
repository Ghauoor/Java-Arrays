package Questions_Arrays;

public class Equilibrium_Index {
    public static void main(String[] args) {

        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(equalSumPartitions(arr));

    }

    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        return totalSum;
    }

    static boolean equalSumPartitions(int[] arr) {

        int totalSum = findArraySum(arr);
        int prefixSum = 0;

        for (int i : arr) {
            prefixSum += i;

            int suffixSum = totalSum - prefixSum;

            if (prefixSum == suffixSum) return true;
        }

        return false;
    }
}
