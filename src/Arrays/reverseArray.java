package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {20,30,40,50,10,90,80};
        System.out.print("Original array: ");
        displayArray(arr);
        System.out.println();
        reversedArray(arr);
        displayArray(arr);
    }
    public static void displayArray(int[] arr){
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    public static void reversedArray(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
