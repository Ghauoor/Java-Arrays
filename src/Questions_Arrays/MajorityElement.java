package Questions_Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {12, 2, 2, 2, 20};

        System.out.println(findMajorityElement(arr));

    }

    static int findMajorityElement(int[] arr) {

        int n = arr.length;
        int count = 1;

        for (int i = 0; i <= n / 2; i++) {

            for (int j = i; j < n; j++) {
                if (arr[j] == arr[i])
                    count++;

                if (count > n / 2)
                    return arr[i];
            }
        }
        return -1;

    }
}
