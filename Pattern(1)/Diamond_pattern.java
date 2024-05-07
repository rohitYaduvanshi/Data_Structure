public class Diamond_pattern {
    public static void diamond_patt(int n){
        for (int i = 1; i <=n; i++) {
            //Spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd -half
        for (int i = n; i>= 1; i--) {
             //Spaces
             for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
            }
            //Stars
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond_patt(5);
    }
}


//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *