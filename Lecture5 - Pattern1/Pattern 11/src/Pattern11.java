/*
        1
        21
        321
        4321
*/

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int num = i;
            while (j <= i) {
                System.out.print(num--);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
