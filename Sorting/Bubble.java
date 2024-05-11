package Sorting;
//large elements come to the end of array by swapping with adjacent elements
public class Bubble {
    public static void bubble_sort(int arr[]){
        for (int turn = 0; turn < arr.length; turn++) {
            int swaps = 0;
            for (int j = 0; j< arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]){
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                    System.out.println(swaps);
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubble_sort(arr); 
        printArr(arr);
    }
}
//time Complexity is BIG O(n^2)