package Arrays.twoD_Array;

public class Spiral_Matrix {
    public static void printSpiral_Matrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0; // Corrected the variable name
        int endRow = matrix.length - 1; // Corrected the endRow and endCol calculations
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print the first row from the remaining rows
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            // Print the last column from the remaining columns
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Print the last row from the remaining rows
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            // Print the first column from the remaining columns
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        printSpiral_Matrix(matrix);
    }
}
