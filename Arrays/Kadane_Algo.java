package Arrays;

public class Kadane_Algo {
    public static void kadans_algo(int n[]){
        int ms = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum = sum+n[i];
            if(sum<0){
                sum = 0;
            }
            ms = Math.max(sum, ms);
        }
        System.out.println("Out max subarray sum is : " + ms);
    }
    public static void main(String[] args) {
        //int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-3,-4}; //Error max = 0;
        kadans_algo(arr);
    }
}
