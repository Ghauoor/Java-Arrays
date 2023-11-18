package Questions_Arrays;

// https://leetcode.com/problems/k-th-symbol-in-grammar/

public class Kth_Grammar {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        if (k % 2 == 1) {
            return kthGrammar(n - 1, (k + 1) / 2);
        } else {
            int ans = kthGrammar(n - 1, k / 2);
            return ans == 0 ? 1 : 0;
        }
    }
}
