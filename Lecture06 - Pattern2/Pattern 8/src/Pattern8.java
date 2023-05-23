/*
            *
           ***
          *****
           ***
            *
*/

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = (n + 1) / 2;

        // 1st half
        int i = 1;
        while (i <= n1) {
            int spaces = 1;
            while (spaces <= n1 - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }

        // 2nd half
        i = n1 - 1;
        while (i > 0) {
            int spaces = 1;
            while (spaces <= n1 - i) {
                System.out.print(" ");
                spaces++;
            }
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println();
        }
    }
}
