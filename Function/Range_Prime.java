package Function;

public class Range_Prime {
    public static boolean isPrime(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primesIn_Range(int n){
        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesIn_Range(50);
    }
}
