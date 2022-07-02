package Questions_Arrays;

import java.util.Scanner;

public class Random_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String[] name = new String[size];

        for (int i = 0; i < size; i++) {

            name[i] = sc.next();
        }

       // System.out.print(Arrays.toString(name));
        //output
        for(int i=0; i<name.length; i++) {
            System.out.println("name " + (i + 1) +" is : " + name[i]);
        }

    }
}
