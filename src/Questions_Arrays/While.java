package Questions_Arrays;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int value;
        int smallest;

        int largest = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        System.out.println("Program terminate after you Enter -99");
        value = input.nextInt();

        smallest = value;


        while(value != -99){
            System.out.print("Enter a number: ");
            value = input.nextInt();
            if(value != -99){
                if (value > smallest){
                    largest = value;
                }
                else{
                    smallest = value;
                }
            }
        }
        System.out.println("Smallest Value: " + smallest + "\nLargest Value: " + largest);
    }
}
