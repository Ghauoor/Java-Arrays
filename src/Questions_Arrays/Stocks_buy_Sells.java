package Questions_Arrays;

public class Stocks_buy_Sells {
    public static void main(String[] args) {

    }

    static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int minSoFar = arr[0];

        for (int i : arr) {
            minSoFar = Math.min(minSoFar, i);

            int profit = i - minSoFar;

            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
