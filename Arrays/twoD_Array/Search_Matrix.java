package Arrays.twoD_Array;

import java.util.Scanner;

public class Search_Matrix {
    public static boolean Search_matrix(int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key){
                    System.out.print("found at cell ("+ i +"  , "+ j +")");
                    return true;
                }
            }
        }
        return false;
    }
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
        Search_matrix(matrix, 5);
        s.close();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a
    }
}
