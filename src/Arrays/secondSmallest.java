package Arrays;

public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("Second smallest element is: " + second_Smallest(arr));
    }
    public static int second_Smallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
