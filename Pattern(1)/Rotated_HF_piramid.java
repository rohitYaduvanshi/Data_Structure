public class Rotated_HF_piramid {
    public static void inverted_rotated_Piramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotated_Piramid(5);
    }
}


// *
// **
// ***
// ****
// *****