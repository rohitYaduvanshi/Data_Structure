
import java.util.Scanner;
public class practiceJAVA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x > 0) {
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less than or equal to Zero");
        }
        
        // Close the Scanner object
        s.close();
    }
}
