import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div = 2;
        while (div < n) {
            if (n % div == 0) {
                System.out.println(n + " is not Prime");
                return;
            }
            div++;
        }
        System.out.println(n + " is Prime");
    }
}
