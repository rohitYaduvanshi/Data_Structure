public class Floyds_Triangle {
    public static void floyd_Triangle(int n){
        int counter = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_Triangle(5);
    }
}


// 1
// 23
// 456
// 78910
// 1112131415