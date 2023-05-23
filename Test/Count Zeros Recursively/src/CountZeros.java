import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countZeros(n));
    }

    public static int countZeros(int n) {
        if (n == 0) {
            return 1;
        }
        return countZeros(n, 0);
    }

    public static int countZeros(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return countZeros(n / 10, ++count);
        } else {
            return countZeros(n / 10, count);
        }
    }
}
