package CoreJava;

public class functions {
    public static void main(String[] args) {
        // Functions are the block of code that takes some input, performs some tasks and returns the output. Basically functions are the reusable block of codes, to which we can call anytime, pass the arguments, and they return the output, we don't need to write that piece of code again and again.
        // Now whenever, we need to calculate addition of 2 numbers or to find cube of a number, we can just call our function, and no need to write again.
        // Functions have a return type: int, void, boolean, double, float, String, array, List, Hashmap etc. anything


        int n1 = cube(3); //27
        System.out.println(add(n1,cube(2))); // add(27,8) -> 35
    }

    // Function to calculate cube of a number
    public static int cube(int num) {
        return num * num * num;
    }

    // Function to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
