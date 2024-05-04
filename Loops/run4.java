import java.util.Scanner;

public class run4 {
    public static void multiplication(int n){
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter number for Table:");
        // int x = s.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n +" * "+ i + " = " + n*i);            
        }
        s.close();
    }
    public static void main(String[] args) {
        multiplication(6);
    }
}
