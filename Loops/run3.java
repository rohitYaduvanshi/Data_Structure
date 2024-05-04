import java.util.Scanner;

public class run3 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = s.nextInt();

        for (int i = 1; i <=x; i++) {
            fact*=i;
        }

        System.out.println("Factorial " + fact);

        s.close();

    }
}
