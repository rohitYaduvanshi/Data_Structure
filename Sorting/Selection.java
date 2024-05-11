package Sorting;
//IDea: Pick the smallest(from unsorted), put it at the begining
public class Selection {
    public static void selection_Sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {  // Min >
                    //For max  < 
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        selection_Sort(arr);
        printArr(arr);
    }
}

//Time comlexity BIG O(n^2)
