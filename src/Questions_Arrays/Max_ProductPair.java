package Questions_Arrays;

public class Max_ProductPair {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,4,3,4};
        String pairs = maxProduct(arr);
        System.out.println(pairs);

    }
    public static String maxProduct(int[] array){
        int maxProduct = 0;
        String pairs = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] * array[j] > maxProduct){
                    maxProduct = array[i] * array[j];
                    pairs = Integer.toString(array[i]) + "," + Integer.toString(array[j]);
                }
            }
        }
        return pairs;
    }
}
