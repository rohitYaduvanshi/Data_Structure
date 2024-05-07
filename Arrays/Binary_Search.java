package Arrays;

public class Binary_Search {
    public static int binarySearch(int n[], int key){
        int start = 0;
        int end = n.length-1;
        while (start <= end) {
            int mid = (start+end)/2;
            //Comparisons
            if(n[mid] == key){
                return mid;
            }
            if (n[mid]> key) {
                end =  mid - 1; 
            }
            else{
                start = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,4,5,6,7,8,9};
        int key = 7;
        int c = binarySearch(num, key);
        System.out.println(" Index for key is " + c);
    }
}
