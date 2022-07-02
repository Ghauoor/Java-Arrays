package Questions_Arrays;

public class Multiple_Number_Missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,11};

        int[] register = new int[arr.length];

        for (int i :
             arr) {
            register[i] = 1;
        }
        System.out.println("All Missing Number in array are : ");
        for (int i = 0; i < register.length; i++) {

            if (register[i] == 0)
                System.out.println(i);
        }
    }
}
