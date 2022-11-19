package Algos;

public class Moores_Voting {
    public static void main(String[] args) {
        int[] arr = {5, 5, 6};

        System.out.println(mooresAlgo(arr));

    }

    static int mooreAlgo(int[] arr) {
        int majorityElement = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                majorityElement = num;
                count++;
            } else if (num == majorityElement) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }

    static int mooresAlgo(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num :
                arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
