package Arrays;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int missingNumber = findMissing(arr);
        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int actualSum = n * (n + 1) / 2;
        int currentSum =0;
        for(int x: arr){
            currentSum+=x;
        }
        return actualSum - currentSum;
    }
}
