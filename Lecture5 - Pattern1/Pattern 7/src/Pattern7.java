/*
        1
        23
        345
        4567
*/

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int t = i;
            int j = 1;
            while (j <= i) {
                System.out.print(t++);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
