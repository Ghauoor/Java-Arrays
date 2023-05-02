package Questions_Arrays;
//https://leetcode.com/problems/sign-of-the-product-of-an-array/description/
public class SIgn_Of_Product_Of_Array {
    public int arraySign(int[] arr) {
        int sign = 1;

        for (int a :
                arr) {
            if (a == 0) {
                return 0;
            }

            if (a < 0) {
                sign = -sign;
            }
        }

        return sign;
    }

    //Another
    public int arraySignOfArray(int[] nums) {
        int countNegitives = 0;

        for (int n :
                nums) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                countNegitives++;
            }
        }

        if (countNegitives % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
