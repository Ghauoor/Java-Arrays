package Questions_Arrays;

public class IS_Unique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 2, 3};

        System.out.println(isUnique(arr));
        System.out.println(uniqueValInArray(arr));

    }

    static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    static int uniqueValInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;

        for (int j : arr) {
            if (j > 0) {
                ans = j;
            }
        }

        return ans;
    }

}
