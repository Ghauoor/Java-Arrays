package Learning_Arrays;


public class One_D_Array_Parent_Class {
    public static void main(String[] args) {
        Single_Dimension_Array sDA = new Single_Dimension_Array(10);

            sDA.insert(0,0);
            sDA.insert(1,10);
            sDA.insert(2,20);
            sDA.insert(3,30);
            sDA.insert(4,40);
            sDA.insert(5,50);
            sDA.insert(12,50);
            sDA.insert(1,23);


        System.out.println("Array Traversal...");
            sDA.traversalArray();

        System.out.println("Searching in Array...");

        sDA.searchInArray(5);

        System.out.println("Deletion in Array");
        sDA.deleteVal(2);
        System.out.println("After deletion: "+sDA.array[2]);

    }
}
