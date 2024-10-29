package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        //Rotate array by K places
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array: ");
        displayArray(arr);
        rotateArray(arr, k);
        System.out.println("\nArray after rotation by " + k + " places: ");
        displayArray(arr);
    }
    public static void displayArray(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    public static void rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % 10; //In case, k is greater than n
        reverseArray(arr, 0, n-1);  // [7 6 5 4 3 2 1]
        reverseArray(arr, 0, k-1);  // [5 6 7] 4 3 2 1
        reverseArray(arr, k, n-1);        // 5 6 7 [1 2 3 4]
    }
    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
