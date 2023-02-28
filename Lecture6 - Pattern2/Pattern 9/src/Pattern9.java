/*
            *
            *1*
            *121*
            *12321*
            *121*
            *1*
            *
*/

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        System.out.println("*");
        int i = 1;
        while (i <= n) {
            System.out.print("*");
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
            System.out.println("*");
        }

        // 2nd half
        i = n - 1;
        while (i > 0) {
            System.out.print("*");
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
            i--;
            System.out.println("*");
        }
        System.out.println("*");
    }
}
