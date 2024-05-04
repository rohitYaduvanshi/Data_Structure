package Function;
//Optimize Function for prime Number
public class prime_Check {
    public static boolean Is_prime(int n){
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Is_prime(3));
        System.out.println(Is_prime(2));
        System.out.println(Is_prime(10));
    }
    
}
