package Arrays;
//Worst Time Complexity
public class Max_SubArray {
    public static void Max_Subarray(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum = sum+arr[j2];
                }
                System.out.println(sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum =" +maxSum);
    }
    public static void main(String[] args) {
        // int a[] = {2,-4,5,8,-1,9};
        int a[] = {2,4,6,8,10};
        Max_Subarray(a);
    }
}


// int a[] = {2,4,6,8,10};
// 2
// 6
// 12
// 20
// 30
// 4
// 10
// 18
// 28
// 6
// 14
// 24
// 8
// 18
// 10
// max sum =30
