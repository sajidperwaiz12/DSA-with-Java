/*
        1357
        3571
        5713
        7135
*/

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int num = 2 * i - 1;
            int j = 1;
            while (j <= n) {
                System.out.print(num);
                num += 2;
                j++;

                if (num > 2 * n - 1) {
                    num = 1;
                }
            }
            i++;
            System.out.println();
        }
    }
}
