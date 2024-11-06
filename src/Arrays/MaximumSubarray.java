package Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum is: " + maxSubarraySum(arr));
    }
    public static int maxSubarraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
    public static int maxSubarraySumKadane(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int current_max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(current_max < 0){
                current_max = 0;
            }
            current_max += nums[i];
            max_so_far = Math.max(max_so_far, current_max);
        }
        return max_so_far;
    }
}
