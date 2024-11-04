package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;  //2 pointers to extreme left and right

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;       // search space reduced to the right and repeat the above process
            } else {
                right = mid - 1;    // search space reduced to the left and repeat the above process
            }
        }

        return -1;
    }
}
