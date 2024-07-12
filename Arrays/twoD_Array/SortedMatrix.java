
package Arrays.twoD_Array;
public class SortedMatrix {
    public static boolean staircaseSearch(int matarix[][], int key){
        int row = 0, col = matarix[0].length-1;
        while (row<matarix.length &&  col >= 0) {
            if(matarix[row][col] == key){
                System.out.println("found key at ("+ row + "," + col +")");
                return true;
            }else if (key < matarix[row][col]) {
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = {{1,2,3,4},
                        //   {5,6,7,8},
                        //   {9,10,11,12},
                        //   {13,14,15,16}};
                        // key not found!

        int matrix[][] = {{10, 20, 30, 40},
                         {15, 25, 35, 45},
                         {27, 29, 37, 48},
                         {32, 33, 39, 50}};
                        //  found key at (3,1)
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
