/*
         *********
          *     *
           *   *
            * *
             *
*/

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i == n) {
                    System.out.print("*");
                } else {
                    if (j == n - i + 1 || j == n + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
