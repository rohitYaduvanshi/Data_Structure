public class Solid_rhonbus {
    public static void solid__rhonbus(int n){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid__rhonbus(10);
    }
}


//     **********
//    **********
//   **********
//  **********
// **********