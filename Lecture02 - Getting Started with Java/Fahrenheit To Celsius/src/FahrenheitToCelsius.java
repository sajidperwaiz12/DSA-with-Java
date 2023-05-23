import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
//        int c =  (5 / 9) * (f - 32);
        int c = 5 * (f - 32) / 9;
        System.out.println(c);
    }
}
