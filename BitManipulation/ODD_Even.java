package BitManipulation;

public class ODD_Even {
    public static void Odd_Even(int n){
        int Bitmask = 1;
        if((n & Bitmask) == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Odd_Even(3);
        Odd_Even(7);
        Odd_Even(8);
        Odd_Even(20);
    }
}

// Output>> 
// Odd
// Odd
// Even
// Even
