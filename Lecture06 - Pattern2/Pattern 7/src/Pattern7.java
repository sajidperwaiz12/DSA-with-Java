/*
            1
           232
          34543
         4567654
*/

import java.util.Scanner;

public class Pattern7 {
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
            int num = i;
            int j = 1;
            while (j <= i) {
                System.out.print(num++);
                j++;
            }
            num = 2 * (i - 1);
            j = i - 1;
            while (j > 0) {
                System.out.print(num--);
                j--;
            }
            i++;
            System.out.println();
        }
    }
}
