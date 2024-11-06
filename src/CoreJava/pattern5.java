package CoreJava;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("N must be an odd number.");
            return;
        }
        int nsp = 1;
        int nst = N / 2 + 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < nst; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < nsp; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l < nst; l++) {
                System.out.print("* ");
            }
            if (i < N / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }
}
