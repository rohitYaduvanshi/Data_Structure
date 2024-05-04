import java.util.Scanner;

public class run2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;
        int count = 0;
        int num;

        System.out.println("Enter integers (enter 0 to stop):");

        do {
            num = scanner.nextInt();
            if (num != 0) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
                count++;
            }
        } while (num != 0);

        if (count > 0) {
            System.out.println("Sum of even integers: " + sumEven);
            System.out.println("Sum of odd integers: " + sumOdd);
        } else {
            System.out.println("No integers entered.");
        }

        scanner.close();     System.out.println("Enter integers (enter 0 to stop):");

        do {
            num = scanner.nextInt();
            if (num != 0) {
                if (num % 2 == 0) {
                    sumEven += num;
                } else {
                    sumOdd += num;
                }
                count++;
            }
        } while (num != 0);

        if (count > 0) {
            System.out.println("Sum of even integers: " + sumEven);
            System.out.println("Sum of odd integers: " + sumOdd);
        } else {
            System.out.println("No integers entered.");
        }

        scanner.close();
    }
}
