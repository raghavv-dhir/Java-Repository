package Arrays;

public class countOfEvenOddElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Number of even elements: " + countEven(arr));
        System.out.println("Number of odd elements: " + countOdd(arr));
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for(int x: arr){
            if (x % 2 == 0) count++;
        }
        return count;
    }
    public static int countOdd(int[] arr) {
        int count = 0;
        for(int x: arr){
            if (x % 2 != 0) count++;
        }
        return count;
    }
}
