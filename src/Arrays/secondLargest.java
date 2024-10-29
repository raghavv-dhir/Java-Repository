package Arrays;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {0,1,2,-6,10};
        System.out.print("Second largest element is: "+secondLarge(arr));
    }
    public static int secondLarge(int[] arr){
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
