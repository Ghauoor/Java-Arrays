package Questions_Arrays;

public class Search_In_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,4,23,56,43};
        int num = 20;
       searchNum(arr, num);

    }
    static void searchNum(int[] arr , int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                System.out.println("This Paticular number is at index: "+ i);
                return;
            }
        }
        System.out.println(num+" is not found in array");

    }
}
