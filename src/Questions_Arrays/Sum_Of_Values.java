package Questions_Arrays;

public class Sum_Of_Values {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};

        System.out.println(sumOfVal(arr));


    }
    static int sumOfVal(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        return sum;
    }

}
