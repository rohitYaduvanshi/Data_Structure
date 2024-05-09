package Arrays;


// Time complexity is O(n^2)


public class Max_subarray {
    public static void maxSubarray(int num[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
       
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int a[] = {1,-2,6,-1,3};
        maxSubarray(a);
    }
}
