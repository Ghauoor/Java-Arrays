package Questions_Arrays;

public class Max_Min_Item {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 44, 5, 64, 3, 4};


        maxVal(arr);
        System.out.println("Max value between range is : " + maxValInRange(arr, 2, 4));

    }

    static void maxVal(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                max = arr[i];
            }

        }
        System.out.println("Maximum value is : "+max);
        System.out.println("Minimum Value is : "+ min);



    }

    static int maxValInRange(int[] arr, int foo, int bar) {
        int max = arr[foo];
        for (int i = 1; i < bar; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}

