package Arrays.twoD_Array;

import java.util.Scanner;

public class Matrix_representation {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        s.close();
    }
}
// 1 2 3 4 5 6 7 8 9
// 1 2 3 
// 4 5 6 
// 7 8 9 