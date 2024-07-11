package Arrays;

public class LargestNum {
    // Method to find the largest number
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;  // Initialize to the smallest possible integer value
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    
    // Method to find the smallest number
    public static int getSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;  // Initialize to the largest possible integer value
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 9, 8, 0, 4};
        
        int largest = getLargest(numbers);
        int smallest = getSmallest(numbers);

        System.out.println("Largest number is " + largest);
        System.out.println("Smallest value is " + smallest);
    }
}
