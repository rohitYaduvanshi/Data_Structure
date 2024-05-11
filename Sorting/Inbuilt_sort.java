package Sorting;
import java.util.*;

public class Inbuilt_sort {
    public static void Printarr(Integer arr[]){  //Change int to Integerfor collection.reverseOrder()
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int arr[] = {5,4,1,3,2};
        
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        Integer arr[] = {5, 4, 1, 3, 2}; // Note: Use Integer instead of int for array sorting
        Arrays.sort(arr, Collections.reverseOrder()); // Sort array in descending order
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        //5 4 3 2 1 
        Printarr(arr);
    }
}
