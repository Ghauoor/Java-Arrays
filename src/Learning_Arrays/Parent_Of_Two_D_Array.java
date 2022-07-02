package Learning_Arrays;

import java.util.Arrays;

public class Parent_Of_Two_D_Array {
    public static void main(String[] args) {
        Two_D_Array tDA = new Two_D_Array(3,3);

        System.out.println("Insertion in Array...");
        tDA.insertVal(0,0,10);
        tDA.insertVal(0,1,20);
        tDA.insertVal(0,2,30);
        tDA.insertVal(2,3,40);


        System.out.println("Accessing the Arrays Element...");

        tDA.accessCell(0,2);

        System.out.println("Traversing in 2DArray");

        tDA.traverse2DArray();

        System.out.println("Searching in Array...");
        tDA.searchingInArray(30);

        System.out.println("Deletion in 2D Array...");

        tDA.deletion2DArray(0,2);
        tDA.deletion2DArray(0,3);

        tDA.accessCell(0,2);



    }

}
