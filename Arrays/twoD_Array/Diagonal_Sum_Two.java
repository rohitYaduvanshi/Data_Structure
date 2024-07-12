
package Arrays.twoD_Array;
public class Diagonal_Sum_Two {
    public static int Optimize_diagonal_Sum(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            //Primary diagonal
            sum +=matrix[i][i];
            //Secondary diagonal
            if (i != matrix.length-i-1) {
                sum += matrix[i][matrix.length-i-1];
            } 
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(Optimize_diagonal_Sum(matrix));
    }
}
