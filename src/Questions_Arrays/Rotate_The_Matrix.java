package Questions_Arrays;

import java.util.Arrays;

public class Rotate_The_Matrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9,}};
        System.out.println("Matrix before rotation :"+Arrays.deepToString(matrix));
        rotate(matrix);
        System.out.println();

        System.out.println("Matrix After rotation :"+Arrays.deepToString(matrix));
    }
    static boolean rotate(int[][] matrix){
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        int n = matrix.length;

        //Looping through layers
        for (int layer = 0; layer < ( n / 2); layer++) {

            int first = layer;

            int last = n - 1 - layer;

            //Looping through cells to change the positions
            for (int i = first; i < last; i++) {
                //find the loc of cells
                int offset = i - first;
                int top = matrix[first][i];
                // Move to left cell to place the top
                matrix[first][i] = matrix[last - offset] [first];
                //Move the last cell to bottom cell
                matrix[last - offset] [first] = matrix[last][last - offset];
                //Right cell to bottom cell
                matrix[last][last - offset] = matrix[i][last];
                //Last cell to top cell
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
