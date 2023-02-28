/*
         *        *
         **      **
         * *    * *
         *  *  *  *
         *   **   *
         *   **   *
         *  *  *  *
         * *    * *
         **      **
         *        *
*/

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = n; j > 0; j--) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // 2nd half
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = n; j > 0; j--) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
