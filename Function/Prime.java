package Function;

public class Prime {
   public static boolean isPrime(int n){

    //CORNER CASES
    if(n == 2){
        return true;
    }
    for (int i = 2; i <=n-1; i++) {
        if(n%i==0){
            return false;
        }
    }
    return true;
   }
   public static void main(String[] args) {
    System.out.println(isPrime(2));
    System.out.println(isPrime(3));
    System.out.println(isPrime(12));
   }
}
