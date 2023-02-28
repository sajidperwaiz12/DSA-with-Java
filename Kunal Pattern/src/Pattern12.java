/*
         * * * * *
          * * * *
           * * *
            * *
             *
             *
            * *
           * * *
          * * * *
         * * * * *
*/

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        for (int i = n; i > 0; i--) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
