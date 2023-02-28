/*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
*/

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
