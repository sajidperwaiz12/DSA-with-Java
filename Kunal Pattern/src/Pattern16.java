/*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
*/

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(combination(i - 1, j - 1) + "   ");
            }

            System.out.println();
        }

    }


    public static int factorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    }

    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
