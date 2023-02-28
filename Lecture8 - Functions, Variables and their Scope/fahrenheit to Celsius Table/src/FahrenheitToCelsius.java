import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int step = s.nextInt();
        printFahrenheitTable(start, end, step);
    }

    public static void printFahrenheitTable(int start, int end, int step) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Print the specified output in required format.
         * Taking input is handled automatically.
         */
        while (start <= end) {
            int c = 5 * (start - 32) / 9;
            System.out.println(start + " " + c);
            start += step;
        }
    }
}
