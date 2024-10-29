package Arrays;

public class sumElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sum(arr));
    }
    public static int sum(int[] array){
        int sum = 0;
        for(int x: array){
            sum = sum + x;
        }
        return sum;
    }
}
