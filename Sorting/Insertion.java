package Sorting;
// Idea: Pick and element(from unsorted part) & place in the right pos in sorted part

public class Insertion {
    public static void insertion_sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;
            //finding put the correct position to insert
            while(previous >=0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            //Insetion
            arr[previous+1] = current;
        }
    }
    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        PrintArr(arr);
    }
}
//Time comlexity BIG O(n^2)