package CoreJava;

public class operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 26;

        //Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (double) (a / b));
        System.out.println("Modulus: " + (double) (a % b));

        //Increment and Decrement Operators(Unary)
        System.out.println("Increment: " + (a++));
        System.out.println("Value of a: " + a);
        System.out.println("Decrement: " + (a--));
        System.out.println("Value of a: " + a);

        //Relational Operators
        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));
        System.out.println("Greater Than: " + (a > b));
        System.out.println("Less Than: " + (a < b));
        System.out.println("Greater Than or Equal To: " + (a >= b));
        System.out.println("Less Than or Equal To: " + (a <= b));

        //Logical Operators
        System.out.println("And: " + (a > 0 && b > 0));
        System.out.println("Or: " + (a > 0 || b > 0));
        System.out.println("Not: " + (!(a > 0)));

        //Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        //Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b)); //How it works? Example: 1010 & 1111 = 1010
        System.out.println("Bitwise OR: " + (a | b));  //How it works? Example: 1010 | 1111 = 1111
        System.out.println("Bitwise XOR: " + (a ^ b));  //Returns 1 if the corresponding bits of two operands are different, and 0 if they are the same. Example: 1010 ^ 1
        System.out.println("Bitwise NOT: " + ~a); // It flips all bits of the number. Example: ~1010 = -1011
        System.out.println("Left Shift: " + (a << 1)); // Left shift moves the bits of the number to the left by the specified number of positions. Example: 1010 << 1 = 10100
        System.out.println("Right Shift: " + (a >> 1)); // Right shift moves the bits of the number to the right by the specified number of positions. Example: 1010 >> 1 = 1005
    }
}
