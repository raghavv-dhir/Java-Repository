package CoreJava;

public class loops {
    public static void main(String[] args) {
        //for loop-> Used when you know the exact number of iterations
        System.out.println("Using For loop");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World! " + i);
        }

        //while loop-> Used when you don't know the exact number of iterations'
        System.out.println("Using While loop");
        int j = 0;
        while (j < 10) {
            System.out.println("Hello, World! " + j);
            j++;
        }

        //do-while loop-> Used when you want to execute the loop at least once
        System.out.println("Using Do-While loop");
        int k = 0;
        do {
            System.out.println("Hello, World! " + k);
            k++;
        } while (k < 10);

        //Enhanced for loop-> Used when you want to iterate over an array or collection
        System.out.println("Using Enhanced For loop");
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5};
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("Sum of array elements: " + sum);
        
        //Break keyword
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + " ");
            if (i == 50) break;
        }
        System.out.println();

        //continue keyword
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0) continue; // Skip even numbers
            System.out.print(i + " ");
        }
    }
    
}
