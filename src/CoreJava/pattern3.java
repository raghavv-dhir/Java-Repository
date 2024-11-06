package CoreJava;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = scanner.nextInt();
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((count++)+" ");
            }
            System.out.println();
        }
    }
}
