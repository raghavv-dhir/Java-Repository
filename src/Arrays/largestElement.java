package Arrays;

import java.util.*;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {-2,9,-5,-10,11,88,1000,-1100,77};
        System.out.println(approach1(arr));
        System.out.println(approach2(arr));
    }
    public static int approach1(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int approach2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
