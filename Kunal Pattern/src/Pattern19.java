/*
         *        *
         **      **
         ***    ***
         ****  ****
         **********
         ****  ****
         ***    ***
         **      **
         *        *
*/

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2 * (n - i); spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int spaces = 1; spaces <= 2 * (n - i); spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
