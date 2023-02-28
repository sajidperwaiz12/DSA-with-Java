/*
             *
            * *
           *   *
          *     *
         *       *
          *     *
           *   *
            * *
             *
*/

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n - i + 1 || j == n + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j == n - i + 1 || j == n + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
