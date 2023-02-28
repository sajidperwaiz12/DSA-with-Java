import java.util.Scanner;

public class FahrenheitCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();

        while (s <= e) {
            int c = 5 * (s - 32) / 9;
            System.out.println(s + "\t" + c);
            s += w;
        }
    }
}
