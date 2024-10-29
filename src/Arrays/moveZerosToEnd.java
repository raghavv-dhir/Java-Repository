package Arrays;

public class moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 0, 3, 0, 4, 0, 5, 0, 6};
        System.out.println("Original array: ");
        displayArray(arr);
        moveZeroesToEnd(arr);
        System.out.println("\nArray with zeros moved to end: ");
        displayArray(arr);
    }
    public static void displayArray(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
    }
    public static void moveZeroesToEnd(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
