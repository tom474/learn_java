package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Access array elements
        System.out.println("Element at (0,0): " + matrix[0][0]);

        // Change an array element
        matrix[0][0] = 10;
        System.out.println("Updated element at (0,0): " + matrix[0][0]);

        // Loop through the multidimensional array
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
