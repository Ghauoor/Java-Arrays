package Project_Arrays;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("How many day's temperature? : ");
        int numDays = sc.nextInt();

        int[] temp = new int[numDays];

        int sum = 0;
        System.out.println();


        for (int i = 0; i < numDays; i++) {
            System.out.print("Day "+ (i + 1) + "'s high temp: ");

            temp[i] = sc.nextInt();

            sum += temp[i];

        }
        sc.close();

        double average = sum / numDays;

        //count the days above average

        int above = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > average){
                above++;
            }
        }

        System.out.println();

        System.out.println("Average Temp = " + average);
        System.out.println();
        System.out.println("Days Above Average : " + above);

    }
}
