package Questions_Arrays;

public class IS_Unique {
    public static void main(String[] args) {
        int[] arr = {12,2,3,1,34,4};

        System.out.println(isUnique(arr));

    }
    static boolean isUnique(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
