package Arrays;

public class checkIfSorted {
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};
        System.out.println("Ascending: "+isAscending(arr));
        System.out.println("Descending: "+isDescending(arr));
    }

    public static boolean isAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // Not in ascending order
            }
        }
        return true; // Array is in ascending order
    }
    public static boolean isDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false; // Not in descending order
            }
        }
        return true; // Array is in descending order
    }
}
