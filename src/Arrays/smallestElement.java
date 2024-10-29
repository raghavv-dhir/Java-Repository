package Arrays;
import java.util.*;
public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 2, 3, 4, 6, 9, 7};
        System.out.println("Smallest element in the array is: " + findSmallest(arr));
        System.out.println("Smallest element in the array using sorting is: " + Arrays.toString(findSmallest2(arr)));
    }

    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static int[] findSmallest2(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0]};
    }
}
