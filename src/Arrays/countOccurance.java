package Arrays;

public class countOccurance {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5};
        int target = 5;
        System.out.println("Count of " + target + " is: " + countOccurrences(arr, target));
    }

    public static int countOccurrences(int[] arr, int target) {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
