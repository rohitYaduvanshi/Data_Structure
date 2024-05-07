public class hollow_rhombus {
    public static void Hollow_rho(int n){
        for(int i = 1; i<=n;i++){
            //spaces print

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //Hollow_rectangle - stars

            for (int j = 1; j <= n; j++) {
                //cell - (i,j) Boundery cell
                if( i == 1 || i ==  n || j == 1 || j ==  n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Hollow_rho(5);
     }
}


//     *****
//    *   *
//   *   *
//  *   *
// *****
