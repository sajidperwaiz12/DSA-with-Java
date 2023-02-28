/*
            1
           121
          12321
         1234321
*/

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }

            j = i - 1;
            while (j > 0) {
                System.out.print(j);
                j--;
            }

            i++;
            System.out.println();
        }
    }
}
