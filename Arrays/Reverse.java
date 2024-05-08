package Arrays;

public class Reverse {
    public static void reverse(int n[]){
        int first = 0, last = n.length-1;
        while (first<last) {
            int temp = n[last];
            n[last] = n[first];
            n[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1,0};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
