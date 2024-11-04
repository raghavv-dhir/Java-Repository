package Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {

        /* LeetCode 41 Hard
        Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

        Example 1:
        Input: nums = [1,2,0]
        Output: 3
        Explanation: The numbers in the range [1,2] are all in the array.

        Example 2:
        Input: nums = [3,4,-1,1]
        Output: 2
        Explanation: 1 is in the array but 2 is missing.

        Example 3:
        Input: nums = [7,8,9,11,12]
        Output: 1
        Explanation: The smallest positive integer 1 is missing.

         */
        int[] arr = {7,8,9,11,12};
        System.out.println("First missing positive number: " + firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Place each positive integer i at index i-1 if possible
        for (int i = 0; i < n; i++) {
            while(arr[i] > 0 && arr[i]<=n && arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1){
                return i+1;
            }
        }

        // If all positive integers from 1 to n are present, return n + 1
        return n+1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
