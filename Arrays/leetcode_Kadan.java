package Arrays;

public class leetcode_Kadan {
    public static int maxSubArray(int[] nums){
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length; i++){
            //Join
            if(sum >= 0){
                sum += nums[i];
            }
            else{
                sum = nums[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }

        return maxSum; 
    }
    public static void main(String[] args) {
        //int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-3,-4};     //Error Solved  max = -1;
        System.out.println("Max subarray is :" + maxSubArray(arr));
    }
}
