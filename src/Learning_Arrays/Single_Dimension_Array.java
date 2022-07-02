package Learning_Arrays;


public class Single_Dimension_Array {
    int[] array = null;
    int a;

    //This Constructor init the array with minimum value
    public Single_Dimension_Array(int sizeOfArr){
        array = new int[sizeOfArr];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
        }

        //Arrays.fill(array, Integer.MIN_VALUE);
    }
    public void insert (int location, int valueToBeInserted){
        try {
            if (array[location] == Integer.MIN_VALUE) {

                array[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This Cell is Already occupied");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index access array");
        }
    }

    //Array traversal

        public void traversalArray(){
        try{
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]+" ");

            }
        }catch (Exception e){
            System.out.println("Array is not existing...");
        }

    }

    public void searchInArray(int val){
        for (int i = 0; i < array.length; i++) {

            if (array[i] == val){
                System.out.println("Value is Found at the index of: "+ i);
                return;
            }
        }
        System.out.println(val+" is not found");
    }
    //Delete value of array

    public void deleteVal(int val){
        try{

            array[val] = Integer.MIN_VALUE;
            System.out.println("The Value has been deleting successfully...");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value is provided is not in the range of array...");

        }
    }
}