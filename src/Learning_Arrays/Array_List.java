package Learning_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        int n = 4;
        ArrayList<Integer> list = new ArrayList<Integer>(n);

        for (int i = 0; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);


        list.remove(3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }



    }
}
