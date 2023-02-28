package Questions_Arrays;

public class Next_Smaller_Element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 10, 22};
        int ele = 4;

        System.out.println(nextSmallerElement(arr, ele));
    }

    public static int nextSmallerElement(int[] arr, int element) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < element) {
                if (result == -1 || arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        if (result == -1) {
            System.out.println("No smaller element found");
        } else {
            System.out.println("Next smaller element: " + arr[result]);
        }
        return result;
    }
}
