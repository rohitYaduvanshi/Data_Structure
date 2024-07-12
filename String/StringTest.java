package String;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        // Demonstrating string input and output

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("You entered: " + name);
        
        sc.close();
    }
}
