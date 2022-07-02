package Questions_Arrays;


public class Find_Unique_Element_OddArray {
    public static void main(String[] args) {

        int[] arr = {2,3,3,2,5,5,13};

        int res = findUniqueItem(arr);

        System.out.println(res);

    }
    static int findUniqueItem(int[] arr){
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
        return ans;
    }
}

