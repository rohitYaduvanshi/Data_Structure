package Sorting;

public class counting_sort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        
        // Find the largest element in the array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        
        // Create a count array to store the frequency of each element
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        
        // Reconstruct the sorted array using the count array
        int j = 0;
        for (int i = 0; i <= largest; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printArr(arr);
    }
}

