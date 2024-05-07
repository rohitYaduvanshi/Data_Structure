package Arrays;
import java.util.*;

public class LargestNum {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if (smallest>numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,6,9,8,0,4};
        
        int c = getLargest(numbers);
        System.out.println("Largest number is " + c);
    }
}
