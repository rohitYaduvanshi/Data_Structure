package Arrays;
import java.util.Arrays;
public class Duplicate_Removing {
    public static int[] sortAndRemoveDuplicates(int[] input) {
        if (input.length == 0) {
            return input;
        }

        
        Arrays.sort(input);

        
        int check = 1; 

        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                input[check] = input[i];
                check++;
            }
        }

        // Step 3: Copy the unique elements to a new array of size uniqueCount
        return Arrays.copyOf(input, check);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 5, 1, 7,8,10, 2,23, 4, 2};
        
        int[] output = sortAndRemoveDuplicates(input);
        
        System.out.println("Sorted array without duplicates: " + Arrays.toString(output));
    }
}


