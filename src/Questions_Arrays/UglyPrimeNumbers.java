package Questions_Arrays;

public class UglyPrimeNumbers {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isUglyNo(n));

    }

    static boolean isUglyNo(int n) {
        if (n == 1) return true;

        while (n > 1) {
            if (n % 2 == 0) n = n / 2;

            else if (n % 3 == 0) n = n / 3;

            else if (n % 5 == 0) n = n / 5;

            else
                break;
        }
        return n == 1 ? true : false;
    }
}
