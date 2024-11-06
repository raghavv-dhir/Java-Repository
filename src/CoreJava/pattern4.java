package CoreJava;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("Please enter odd value of N only!");
        } else {
            printDiamond(N);
        }
    }

    public static void printDiamond(int N) {
        /*
            *
          * * *
        * * * * *
          * * *
            *
         */
        int nst = 1;
        int nsp = N / 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < nst; k++) {
                System.out.print("* ");
            }
            if (i < N/2 ){
                nst+=2;
                nsp--;
            } else {
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}