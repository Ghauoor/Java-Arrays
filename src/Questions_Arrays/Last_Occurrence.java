package Questions_Arrays;

public class Last_Occurrence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 34, 3, 34, 5, 3};

        System.out.println(lastOccurance(arr, 3));

    }

    static int lastOccurance(int[] arr, int k) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
