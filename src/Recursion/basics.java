package Recursion;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        // Recursion is nothing just a function calling itself until a base case is reached.
        /*3 magical steps of recursion are:
        1. Faith: What your function should do and have faith that the function works.
        2. Main Logic: Solving your problem with sub-problem.
        3. Base Case: The condition when your function should stop calling itself and return a result.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        System.out.println("Sum from 1 to "+ n +" is: "+sum(n));
        System.out.println("Factorial of "+n+" is: "+factorial(n));
        System.out.println("Fibonacci number "+n+" is: "+fibonacci(n));
        printNumbers(n);
        System.out.println();
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println(a+" raised power "+n+" is equal to: "+ power(a,n));
        char[] ch = {'m', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm'};
        int s = 0,e = ch.length-1;
        System.out.println("Palindrome of the string: "+stringPalindrome(ch,s,e));
    }

    // Recursive function to calculate sum of first n natural numbers
    public static int sum (int n) {
        if (n == 1) return 1; //Base case: Solution to smallest sub-problem.
        int temp = sum(n-1);
        return temp + n;
    }

    //Recursive function to calculate factorial of N
    public static int factorial(int n){
        if(n == 1) return 1; //Base case: Solution to smallest sub-problem
        int temp = factorial(n-1);
        return temp * n;
    }

    //Recursive function to calculate Nth Fibonacci number
    public static int fibonacci(int n) {
        //0 + 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 +........& so on
        if(n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //Recursive function to print numbers from 1 to N
    public static void printNumbers(int n) {
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printNumbers(n-1);
        System.out.print(n+" ");
    }

    //Recursive function to print a^n (Given a and n)
    public static int power(int a, int n){
        if(n == 1) return a; //Base case: Solution to smallest sub-problem
        int temp = calcPower(a,n/2);
        if (n % 2 == 0) return temp * temp;
        else return temp * temp * a;
    }

    //Recursive function to check if an array is palindrome or not
    public static boolean stringPalindrome(char[] ch, int start, int end){
        if(start == end || start > end) return true;
        if(ch[start] == ch[end]){
            return stringPalindrome(ch,start+1,end-1);
        } else {
            return false;
        }
    }

    //function to calculate a^b
    public static int calcPower(int a, int b){
        if(b == 0) return 1; //Base case: Solution to smallest sub-problem
        return a * calcPower(a, b-1);
    }
}
/*
1. --------->Sum function:
Call Stack: For N= 10        |sum(1) condition true: return 1      |
                             |sum(2), temp = 1 => 3:  return 3     |
                             |sum(3), temp = 3 => 6:  return 6     |
                             |sum(4), temp = 6 => 10: return 10    |
                             |sum(5), temp = 10 => 15: return 15   | <------Stack
                             |sum(6), temp = 15 => 21: return 21   |
                             |sum(7), temp = 21 => 28: return 28   |
                             |sum(8), temp = 28 => 36: return 36   |
                             |sum(9), temp = 36 => 45: return 45   |
     start from here  -----> |sum(10), temp = 45 => 55: return 55  |
                             +-------------------------------------+
     Flow of Recursion:
     sum(10) -> sum(9) -> sum(8) -> sum(7) -> sum(6) -> sum(5) -> sum(4) -> sum(3) -> sum(2) -> sum(1)

2. --------->Factorial Function:
Call Stack: For N= 5         |sum(1) condition true: return 1      |
                             |sum(2), temp = 1 => 2:  return 2     |
                             |sum(3), temp = 2 => 6:  return 6     |  <------Stack
                             |sum(4), temp = 6 => 24: return 24    |
    start from here  ----->  |sum(5), temp = 24 => 120: return 120 |
                             +-------------------------------------+
    Flow of Recursion: factorial(10) -> factorial(9) -> factorial(8) -> factorial(7) -> factorial(6) -> factorial(5) -> factorial(4) -> factorial(3) -> factorial(2) -> factorial(1)

3. --------->Fibonacci Function:
Call Stack: For N= 7
                           | fibonacci(0)  -> return 0                                       |
                           | fibonacci(1)  -> return 1                                       |
                           | fibonacci(2)  -> fibonacci(1) -> fibonacci(0) => 1 + 0 => 1     |
                           | fibonacci(3)  -> fibonacci(2) -> fibonacci(1) => 1 + 1 => 2     |
                           | fibonacci(4)  -> fibonacci(3) -> fibonacci(2) => 2 + 1 => 3     |
                           | fibonacci(5)  -> fibonacci(4) -> fibonacci(3) => 3 + 2 => 5     | <--stack
                           | fibonacci(6)  -> fibonacci(5) -> fibonacci(4) => 5 + 3 => 8     |
                           | fibonacci(7)  -> fibonacci(6) -> fibonacci(5) => 8 + 5=> 13     |
                           | fibonacci(8)  -> fibonacci(7) -> fibonacci(6) => 13 + 8 => 21   |
                           | fibonacci(9)  -> fibonacci(8) -> fibonacci(7) => 21 + 13 => 34  |
  start from here  ----->  | fibonacci(10) -> fibonacci(9) -> fibonacci(8) => 34 + 21 => 55  |
                           +-----------------------------------------------------------------+

4. ---------> printNumber function
Call stack for N=5
                          | printNumber(1) ->print("1 ")  |
                          | printNumber(2) ->print("2 ")  |
                          | printNumber(3) ->print("3 ")  |  <--stack
                          | printNumber(4) ->print("4 ")  |
  start from here  -----> | printNumber(5) ->print("5 ")  |
                          +-------------------------------+

5. ---------> power function
Call stack for a=2, b= 5
                           4. ---------> printNumber function
Call stack for N=5
                          | power(2^0) return 1= temp  |
                          | power(2^1) => 1 * 2 = 2    |
                          | power(2^2) => 2 * 2 = 4    |
                          | power(2^3) => 4 * 2 = 8    |  <--stack
                          | power(2^4) => 8 * 2 = 16   |
  start from here  -----> | power(2^5) => 16 * 2 = 32  |
                          +----------------------------+
*/
