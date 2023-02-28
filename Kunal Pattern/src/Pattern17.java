/*
         1
        212
       32123
      4321234
       32123
        212
         1
*/

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            int  num = i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(num);
                num--;
            }

            num = 2;
            for (int j =  i - 1; j > 0 ; j--) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }

        // 2nd half
        for (int i = n - 1; i > 0; i--) {
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            int  num = i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(num);
                num--;
            }

            num = 2;
            for (int j =  i - 1; j > 0 ; j--) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }
    }
}
