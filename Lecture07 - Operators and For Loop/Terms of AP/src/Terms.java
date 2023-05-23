import java.util.Scanner;

public class Terms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 1;
        for (int i = 1; count <= n; i++) {
            if ((3 * i + 2) % 4 != 0) {
                System.out.print((3 * i + 2) + " ");
                count++;
            }
        }
    }
}
