public class HF_with_Numbers {
    public static void half_pyramid_with_Num(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_pyramid_with_Num(5);
    }
}


// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 
