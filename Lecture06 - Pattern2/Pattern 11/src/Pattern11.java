/*
        1=1
        1+2=3
        1+2+3=6
*/

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int sum = 0;
            int j = 1;
            while (j <= i) {
                sum += j;
                if (j != i) {
                    System.out.print(j + "+");
                } else {
                    System.out.print(j + "=");
                }
                j++;
            }
            i++;
            System.out.println(sum);
        }
    }
}
