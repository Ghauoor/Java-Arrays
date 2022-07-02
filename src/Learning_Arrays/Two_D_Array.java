package Learning_Arrays;

public class Two_D_Array {

    int[][] array = null;

    //Cons
    public Two_D_Array(int numOfRow, int numOfColumns){
        this.array = new int[numOfRow][numOfColumns];
        for (int row = 0; row < array.length; row++) {

            for (int col = 0; col < array[0].length; col++) {

                array[row][col] = Integer.MIN_VALUE;

            }
        }
    }

    //Insert value.. ->

    public void insertVal(int row , int col, int val){
        try{
            if (array[row][col]== Integer.MIN_VALUE){
                array[row][col] = val;
                System.out.println("The Value is Successfully Inserted...");
            } else {
                System.out.println("This is Already Occupied....");
            }

        } catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Invalid Index...");
        }
    }
    //Accessing Cell the 2D array

    public  void accessCell(int row, int col){
        System.out.println("\nAccessing the Row#"+ row + ", Col#"+col);
        try{
            System.out.println("Cell value is: "+array[row][col]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index....");
        }
    }
    //Traversing 2D 
    public  void  traverse2DArray(){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {

                System.out.println(array[row][col] + " ");

            }
            System.out.println();
        }
    }

    //Searching in the 2D Array... --->

    public void searchingInArray(int val){
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                if (array[row][col] == val){
                    System.out.println("Value is found at this row: " + row + " and this Column: "+ col);
                    return;
                }
            }
        }
        System.out.println("Value is not found...");
    }
    //Deletion in 2Array
    public void deletion2DArray (int row, int col){
        try{
            System.out.println("Successfully deleted "+ array[row][col]);
            array[row][col] = Integer.MIN_VALUE;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for this array");
        }
    }

}
