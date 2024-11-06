package Arrays;
import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println("Array contains duplicate elements: " + containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] arr) {
        //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
