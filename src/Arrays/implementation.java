package Arrays;

public class implementation {
    public static void main(String[] args) {
        //Arrays:
        // We can store multiple values in a single variable.
        // An array is a collection of elements of the same type stored in contiguous memory locations.
        // Fixed size -> arrays cannot be resized after creation.
        // 0- based indexing -> arrays start from index 0.

        //Declaring and initializing array of integers:
        int[] numbers = {1, 2, 3, 4, 5};

        //Accessing elements of an array:
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        //Updating elements of an array:
        numbers[0] = 10;
        System.out.println("Updated first element: " + numbers[0]);

        //Array length:
        System.out.println("Length of the array: " + numbers.length);

        //When we don't know elements of array:
        int size = 5;
        int[] arr = new int[size];
        for(int x: arr){
            System.out.print(x + " ");  //default value for int is 0
        }
        System.out.println();

        String[] names = new String[5];
        names[0] = "Jasprit Bumrah";
        names[1] = "Bhuvneshwar Kumar";
        names[2] = "Mohammad Shami";
        names[3] = "Ravindra Jadeja";
        names[4] = "Ravichandran Ashwin";
        for(String x: names){          //traversing array using enhanced for loop
            System.out.print(x+" ");
        }

        //Internal working of array:
        // array =          [12    88    65    44    97    69    54    19    12]
        // index =            0     1     2     3     4     5     6     7     8
        //base address =   1000   1004  1008   1012  1016  1020  1024  1028  1032
        // General formula to find the address of an element = base address + (index * size of data type)
        //Example: Address of 69 = 1020 + (5 * 4) = 1000 + (5 * 4B) = 1020
        //Here every element is converted to 32 bits binary number.

        //Benefits of contiguous memory:
        //1. Accessing elements in an array is faster as they are stored in contiguous memory locations(O(1) time complexity for accessing an element)
        //2. Memory usage is reduced as the array elements are stored together in a single block.
    }
}
