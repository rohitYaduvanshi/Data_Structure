package Arrays;
import java.util.*;

public class Linear_Search {
    public static int linearSearch(int num[], int key){
        for (int i = 0; i < num.length; i++) {
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;

        //Asking For Size
        System.out.println("Enter the Array Size: ");
        n = s.nextInt();

        // New Array "Storing the Elements"
        int[] num = new int[n];

        //Putting the elements..
        System.out.println("Enter array Element");
        for (int i = 0; i < n; i++) {
            num[i] = s.nextInt();
        }
        System.out.println("Enter key:");
        int key = s.nextInt();

        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("key is at index: " + index);
        }
        s.close();
    }
}
